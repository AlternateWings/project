/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Repository;

import com.example.demo.Model.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Aw Boon Chen
 */

public interface TodoRepo extends JpaRepository<ToDoList, Long> {
    
}

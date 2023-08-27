/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Model.Users;

/**
 *
 * @author Aw Boon Chen
 */
public interface UserRepo extends JpaRepository<Users, Long> {
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Aw Boon Chen
 */

@Entity
public class ToDoList {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long listId;
    
    @Column
    private long userId;
    
    @Column
    private String todoDesc;
    
    @Column
    private boolean todoFlag;

    public long getListId() {
	return listId;
    }

    public void setListId(long listId) {
	this.listId = listId;
    }

    public long getUserId() {
	return userId;
    }

    public void setUserId(long userId) {
	this.userId = userId;
    }

    public String getTodoDesc() {
	return todoDesc;
    }

    public void setTodoDesc(String todoDesc) {
	this.todoDesc = todoDesc;
    }

    public boolean isTodoFlag() {
	return todoFlag;
    }

    public void setTodoFlag(boolean todoFlag) {
	this.todoFlag = todoFlag;
    }
    
    
}

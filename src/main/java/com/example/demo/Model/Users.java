/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Aw Boon Chen
 */

@Entity
public class Users implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userID;
    
    @Column
    private String username;
    
    @Column
    private String password;
    
    @Column
    private String email;

    public long getUserID() {
	return userID;
    }
    
    
    public void setUserID(long userID) {
	this.userID = userID;
    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }
    
    
}

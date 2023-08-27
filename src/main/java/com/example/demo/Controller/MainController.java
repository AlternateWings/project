/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Controller;

import com.example.demo.Model.ToDoList;
import com.example.demo.Model.Users;
import com.example.demo.Repository.TodoRepo;
import com.example.demo.Repository.UserRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Aw Boon Chen
 */

@RestController
public class MainController {
    
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private TodoRepo todoRepo;
    
    @GetMapping(value = "/")
    public String getPage() {
	return "Start Page";
    }
    
    @GetMapping(value = "/users")
    public List<Users> GetUsers() {
	return userRepo.findAll();
    }
    
    @PostMapping(value = "/saveuser")
    public String saveUsers(@RequestBody Users user) {
	userRepo.save(user);
	return "New user saved";
    }
    
    @PutMapping(value = "/update/{id}")
    public String updateUsers(@PathVariable long id, @RequestBody Users user) {
	Users updatedUser = userRepo.findById(id).get();
	updatedUser.setUsername(user.getUsername());
	updatedUser.setPassword(user.getPassword());
	updatedUser.setEmail(user.getEmail());
	userRepo.save(updatedUser);
	return "Updated User";
    }
    
    @DeleteMapping(value = "/delete/{id}")
    public String deleteUsers(@PathVariable long id) {
	Users deleteUser = userRepo.findById(id).get();
	userRepo.delete(deleteUser);
	return "Deleted User";
    }
    
    @GetMapping(value = "/todolist/{id}")
    public List<ToDoList> GetTodoList(@PathVariable Iterable<Long> id) {
	return todoRepo.findAllById(id);
    }
    
    @PostMapping(value = "/savetodoitem")
    public String saveTodo(@RequestBody ToDoList item) {
	todoRepo.save(item);
	return "New todolist item saved";
    }
    
    @PutMapping(value = "/updatetodo/{id}")
    public String updateTodo(@PathVariable long id, @RequestBody ToDoList item) {
	ToDoList updatedItem = todoRepo.findById(id).get();
	updatedItem.setTodoDesc(item.getTodoDesc());
	updatedItem.setTodoFlag(item.isTodoFlag());
	todoRepo.save(updatedItem);
	return "Updated ToDoList Item";
    }
    
    @DeleteMapping(value = "/deletetodo/{id}")
    public String deleteTodo(@PathVariable long id) {
	ToDoList deleteItem = todoRepo.findById(id).get();
	todoRepo.delete(deleteItem);
	return "Deleted ToDoList Item";
    }
}

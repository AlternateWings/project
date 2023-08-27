# project
Test Project for a ToDoList API

1.1 Running
Set up the app and run on preferred IDE.
Default URL: localhost:8080
Default DB Port: 3306

1.2 Testing
Contains 2 tables, User and ToDoList
"/users" will return all users in the database.
"/saveuser" will save user details. (username, password and email)
"/update/{id}" will update user for that ID.
"/delete/{id}" wlll delete user for that ID.
"/todolist/{id}" will return all todolist for that user ID.
"/savetodoitem" will will save an item to the list (ID dependent)
"/updatetodo/{id}" will update todo for the todolist item.
"/deletetodo/{id}" wll delete that todolist item.

1.3 Building
Built originally using Apache Netbeans using Spring Web framework, JPA and MySQL.
JDK Version 17
MySQL Version 8.0.33

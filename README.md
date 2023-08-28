# project
Test Project for a ToDoList API

1.1 Running<br>
Set up the app and run on preferred IDE.<br>
Default URL: localhost:8080<br>
Default DB Port: 3306

1.2 Testing<br>
Contains 2 tables, User and ToDoList<br>
"/users" will return all users in the database.<br>
"/saveuser" will save user details. (username, password and email)<br>
"/update/{id}" will update user for that ID.<br>
"/delete/{id}" wlll delete user for that ID.<br>
"/todolist/{id}" will return all todolist for that user ID.<br>
"/savetodoitem" will will save an item to the list (ID dependent)<br>
"/updatetodo/{id}" will update todo for the todolist item.<br>
"/deletetodo/{id}" wll delete that todolist item.

1.3 Building<br>
Built originally using Apache Netbeans using Spring Web framework, JPA and MySQL.<br>
JDK Version 17<br>
MySQL Version 8.0.33

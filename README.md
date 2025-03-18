📌 Project Management System

A Spring Boot project management system using JSP, JDBC, and MySQL. This system allows users to create, view, update, and delete projects efficiently.

🚀 Features

✅ Manage Projects (Add, Edit, Delete, View)

✅ Simple JSP-Based UI

✅ Spring Boot & JDBC Integration

✅ MySQL Database Support

✅ REST API for Projects

✅ Bootstrap for Styling





🛠️ Technologies Used

Backend: Java, Spring Boot, JDBC

Frontend: JSP

Database: MySQL

Tools: Maven, Tomcat, IntelliJ IDEA/Eclipse

📌 How to Install & Run

1️⃣ Clone the Repository

git clone https://github.com/surajbejagam/ProjectManagementSystem.git
cd ProjectManagementSystem

2️⃣ Configure Database

Create a MySQL database:

CREATE DATABASE project_management;
USE project_management;

Update src/main/resources/application.properties with your database credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/project_management
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

3️⃣ Build & Run the Project

mvn clean package
mvn spring-boot:run

OR, if using Tomcat:

mvn tomcat10:run

4️⃣ Access the Application

JSP UI: http://localhost:8080/projects


📌 API Endpoints

Method

Endpoint

Description

GET

/api/projects

Get all projects

POST

/api/projects

Create a new project

PUT

/api/projects/{id}

Update a project

DELETE

/api/projects/{id}

Delete a project

📌 Adding Fake Data

Manual SQL Insert:

INSERT INTO projects (name, description, start_date, end_date) VALUES
('Sample Project', 'This is a test project.', '2025-04-01', '2025-08-30');

Auto Generate Fake Data (Java Faker)

Modify ProjectDAO.java:

import com.github.javafaker.Faker;
Faker faker = new Faker();
jdbcTemplate.update("INSERT INTO projects (name, description, start_date, end_date) VALUES (?, ?, ?, ?)",
    faker.app().name(), faker.lorem().sentence(), "2025-01-01", "2025-12-31");

🎯 How to Contribute

Fork the repository

Create a new branch (git checkout -b feature-branch)

Commit your changes (git commit -m "Added a new feature")

Push to GitHub (git push origin feature-branch)

Open a Pull Request 🚀


📌 Author

👨‍💻 Developed by Suraj

📩 Contact: surajbejagam@example.com

🌟 Give this project a star if you find it useful! ⭐


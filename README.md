# Class-Scheduling-Project
This is a small prototype for class scheduling project made with absolutely with java and used almost all OOP(Object Oriented Programming) features. It has GUI components that allows user to interact with it in a very friendly way. I also want to mention that this project was created as my academic purpose.

Step by Step Database creation and connection:

1. First go to xampp mysql admin panel
![image](https://github.com/user-attachments/assets/387df530-dec2-4591-bfab-63d8818a77a2)

3. Select SQL option from the tab menu, then paste this command

CREATE DATABASE classschedulerdb;
USE classschedulerdb;

CREATE TABLE NewInstructors (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    `key` VARCHAR(50) UNIQUE NOT NULL,
    courses VARCHAR(255) NOT NULL
);

![image-2](https://github.com/user-attachments/assets/12934339-95b9-4728-b6f3-58c97be13bfa)

3. Now select the Go option located down right
4. 
5. Now look at the left menu, you can see the database name. Click + icon and you can see the table. Click on it and see all the details

![image-3](https://github.com/user-attachments/assets/baf3278e-8517-4b32-ab54-316ff80d9243)




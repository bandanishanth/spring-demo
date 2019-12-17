#A Simple Student Info Web Application using Spring Boot

The repository implements a very simple application that takes Student information entered by the user and pushes it to a database.

Currently the application only supports data insertion and search.

There is also an option to clear the database and remove all record.

To get started, run the application on localhost and go to 'localhost:8080/form'.

There are two ways to interact with this application:
1)Using a tool like POSTMAN via JSON requests and responses.

The PATHS allowed presently are:
A) '/students/all'

B) '/students/create using a POST request.'

C) '/students/clear' which clears the database of all records.


2)Using the views provided.

The PATHS allowed presently are:
A) '/form' - To insert a student record.

B) '/students' - To Display all the students.

C) '/search' - To search the records using student name.
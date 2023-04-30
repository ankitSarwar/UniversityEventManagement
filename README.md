<h1 align="center"> 👤University Event Management🎉</h1>

>### Framework Used 
 * ![SpringBoot](https://img.shields.io/badge/SpringBoot-White?style=flat&logoColor=Blue)

>### Language Used
* ![Java](https://img.shields.io/badge/Java-White?style=flat&logoColor=Blue)
>## Data flow
In this project, we have four layers-
* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer mainatains the h2-database thing on which CRUD operations are performed
* **Model** - This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored.

>## Data Structure used in my project
This document outlines the steps to create a student model and an event model (Id,name,department,branch,location,description,starttime,endtime,date)
Student model will have-
* StudentId
* first name
* last name
* age
* department

Event Model will have
* eventId
* eventName
* locationOfEvent
* date
* startTime
* endTim

>## Project Summary

The above project implements a UniversityEvent Management project in which the endpoints provided are:-

* Add student
* update student  
* department
* delete student
* Get all students 
* Get student by Id
* Add event
* Update event
* Delete event
* Get All events by date

Also we have added validation on below ->
* Validation on age(between 18 -25)
* First name(first letter should be capital) 
*  Department(datatype of variable department should be Enum and not string Enum should support department names line ME , ECE , civil , CSE). 

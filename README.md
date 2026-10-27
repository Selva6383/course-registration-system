# 🎓 Course Registration System

A RESTful backend application built using Java and Spring Boot to manage available courses and student course registrations. The application uses Spring Data JPA and MySQL for persistent data storage.

## 🚀 Features

* Retrieve all available courses
* Register students for courses
* View students enrolled in courses
* Store student registration details in MySQL
* Build REST APIs using Spring Boot
* Separate application logic using a layered architecture
* Enable cross-origin requests (CORS) for frontend integration

## 🛠️ Technologies Used

* **Language:** Java 21
* **Framework:** Spring Boot
* **Persistence:** Spring Data JPA, Hibernate
* **Database:** MySQL
* **Build Tool:** Maven
* **API Testing:** Postman

## 🏗️ Project Architecture

The application follows a layered architecture:

* **Controller:** Handles HTTP requests and API responses.
* **Service:** Manages business logic.
* **Repository:** Handles database operations using Spring Data JPA.
* **Entity:** Represents course and student registration data.

## 📌 API Endpoints

| Method | Endpoint                 | Description                     |
| ------ | ------------------------ | ------------------------------- |
| GET    | `/courses`               | Retrieve available courses      |
| POST   | `/courses/register`      | Register a student for a course |
| GET    | `/courses/registrations` | Retrieve enrolled students      |

**Note:** Confirm these endpoint paths against your actual controller mappings before publishing.

## 🗄️ Database

MySQL is used to persist course and registration information.

Registration details include:

* Student name
* Student email
* Course information

## ⚙️ How to Run

### Prerequisites

* Java JDK 21
* IntelliJ IDEA or another Java IDE
* MySQL Server
* Maven

### Steps

1. Clone the repository:

   ```bash
   git clone https://github.com/Selva6383/course-registration-system.git
   ```

2. Open the project in IntelliJ IDEA.

3. Configure your MySQL database connection in `application.properties`.

4. Ensure that MySQL is running and the configured database exists.

5. Run the Spring Boot application.

6. Test the API endpoints using Postman.

## 🎯 Learning Outcomes

* Developed REST APIs using Spring Boot.
* Implemented layered architecture.
* Integrated MySQL using Spring Data JPA.
* Managed course registrations and database persistence.
* Configured CORS for frontend integration.

## 👨‍💻 Author

**Selvaganapathy S**

GitHub: [Selva6383](https://github.com/Selva6383)

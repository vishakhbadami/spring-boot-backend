# Spring Boot Backend for Patient and Heart Rate Management

This project is a simple **Spring Boot** backend designed to manage patients' heart rate records. It includes basic **RESTful APIs** to handle user registration, patient management, and heart rate data. This backend system could be the foundation for a more complex healthcare application in the future.

## Project Overview

The system allows:
- User registration and login.
- Management of patient information (create, retrieve).
- Recording and retrieving heart rate data for patients.

---

## Assumptions & Decisions

- **Database**: This project uses an in-memory H2 database for simplicity. It can be replaced with more robust databases like MySQL or PostgreSQL.
- **No Authentication/Authorization**: For simplicity, the project doesn't use authentication (like JWT). User login and registration are based on email and password validation.
- **Technology Stack**:
  - **Spring Boot**: For building the backend application.
  - **H2 Database**: An in-memory database for storing data temporarily.
  - **Maven**: As a build tool to manage dependencies and build the project.

---

## Features

### **1. User Management**
- **User Registration**: Users can register using an email and password.
- **User Login**: Registered users can log in using their email and password.

### **2. Patient Management**
- **Add Patient**: Ability to create and store patient details (name, age, gender).
- **Retrieve Patient**: Retrieve patient details based on their unique ID.
- **List All Patients**: View a list of all patients in the system.

### **3. Heart Rate Management**
- **Record Heart Rate**: Record the heart rate of a patient (beats per minute).
- **Retrieve Heart Rate**: View all heart rate records for a specific patient.

---

## Setup and Running the Project

### Prerequisites

- **Java 17** or higher.
- **Maven** or **Gradle** (Maven is used in this project).
- An IDE like **IntelliJ IDEA** or **Eclipse**.
- **Git** (if you are cloning the repository).

### Steps to Run

1. **Clone the Repository**:
   If you haven't cloned the repository yet, use the following command:
   ```bash
   git clone https://github.com/vishakhbadami/spring-boot-backend.git

### API Documentation
1. User API
User Registration
URL: POST /api/users/register
Request Body:
{
  "email": "user@example.com",
  "password": "password123"
}
Response:
{
  "message": "User registered successfully!"
}

User Login
URL: POST /api/users/login
Request Body:
{
  "email": "user@example.com",
  "password": "password123"
}
Response:
{
  "message": "Login successful!"
}


Heart Rate API

Record Heart Rate for a Patient
URL: POST /api/heartrate/record
Request Parameters:
patientId: 1
bpm: 75
Response:
{
  "message": "Heart rate recorded successfully!"
}
Retrieve Heart Rate Records for a Patient
URL: GET /api/heartrate/patient/{patientId}
]

### Additional Information
Database: This project uses an in-memory H2 database for quick development. This can be easily replaced with a persistent database such as MySQL or PostgreSQL.

No Authentication: This is a simple example without any authentication mechanisms (e.g., JWT). You can extend this project with Spring Security to add authentication and authorization in the future.

Testing: You can use tools like Postman or Insomnia to test the APIs, or even curl commands if you prefer.

Error Handling: The project includes basic error handling. More sophisticated error handling can be added later, such as custom exception classes and better response status codes.

License
This project is licensed under the MIT License - see the LICENSE file for details.

Contact
For any inquiries or feedback, you can reach out to:

Email: vishakhbadami@gmail.com
GitHub: https://github.com/vishakhbadami



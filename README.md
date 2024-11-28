# spring-boot-backend
A backend project for patient and heart rate management.

# Spring Boot Backend for Patient and Heart Rate Management

This project is a simple Spring Boot backend designed for managing patient details and their heart rate records. It includes basic RESTful APIs for user registration and login, patient management, and recording/retrieving heart rate data.

## Assumptions and Decisions

- **Database**: This project uses an in-memory H2 database for simplicity. You can configure it to use other databases (like MySQL or PostgreSQL) in the `application.properties` file if needed.
- **No authentication/authorization**: For simplicity, there is no authentication mechanism (like JWT tokens) for user login. Users are identified by email and password only.
- **API Design**: RESTful API design principles are followed for creating and managing patients and heart rate data.
- **No complex error handling**: Basic error handling is included, but more advanced handling (such as custom exception classes) can be added.

## Setup and Running the Project

### Prerequisites

- **Java 17 or higher** installed.
- **Maven** or **Gradle** for building the project (Maven is used in this case).
- **IDE**: IntelliJ IDEA or Eclipse, or a simple text editor like VS Code.

### Steps to Run

1. **Clone the Repository**:
   If you haven’t already cloned the repository, you can clone it using the following command:
   ```bash
   git clone https://github.com/your-username/spring-boot-backend.git

Navigate to the Project Directory:

bash
Copy code
cd spring-boot-backend
Build the Project: If you're using Maven, run the following command:

bash
Copy code
mvn clean install
Run the Application: You can run the application by executing the following command:

bash
Copy code
mvn spring-boot:run
Alternatively, if you are using IntelliJ IDEA or Eclipse, you can directly run the Demo1Application.java file (or BackendApplication.java if you renamed it).

Access the Application: The application will run on http://localhost:8080.

# RestAPI Call
 Simple RestAPI Call to save the user details

## Setup Instructions
 To get started with this project, follow these steps:

1. **Clone the repository**:
 - git clone <repository_url>
 - cd <project_directory>

2. **Prerequisites**:

 - Java Development Kit (JDK) 11 or higher
 - Integrated Development Environment (IDE) such as Eclipse or IntelliJ IDEA
 - MySQL Server 9.0
 - MySQL Workbench (optional, for database management)
 - Maven (for dependency management)
 - Tomcat (8/9)
 - Postman (web or desktop)

3. **Database Setup**:

 Create a database schema named Library.
 
 Create the following tables:

 Create schema Employee;

  create table emp(
    id INT primary key,
    name varchar(40),
    sal INT
  );


4. **Update Configuration**:
 
 - spring.datasource.url=jdbc:mysql://localhost:3306/Employee
 - spring.datasource.username=<your_database_username>
 - spring.datasource.password=<your_database_password>

5. **Running the Application**:

 Build and run the application using your preferred IDE. Choose the option to "Run as Server".
 Once the application is running, open your browser and navigate to the following URLs to access the application:
 - http://localhost:8080
 - http://localhost:8080/RestCallDemo/

6. **Postman Configuration**:
   - POST URL: http://localhost:8080/[YourContextPath]/api/user
   - Method: POST
   - Headers: Content-Type: application/json
   - Body (raw, JSON):
        {
          "id":1,
          "name": "John Doe",
          "salary": 3000
        }
   - Click submit and below should get response
          {
          "id":1,
          "name": "John Doe",
          "salary": 3000
        }
   

## Author
 Shravani Mahendrakar
 GitHub: @shravanimahendrakar

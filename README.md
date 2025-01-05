
# Worker Management System  

A comprehensive worker management application that allows adding workers and searching for them based on various criteria such as name, department, and technology.  


## Features  

- Add workers with details such as name, department, and technology.  
- Search for workers by name, department, or technology.  
- User-friendly interface built with HTML, CSS, and JavaScript.  
- Robust backend developed with Spring Boot.  

 
## Tech Stack  

- **Backend**: Spring Boot  
- **Frontend**: HTML, CSS, JavaScript  
- **Build Tool**: Maven  
- **Development Environment**: IntelliJ IDEA  

## Installation  

1. Clone the repository:  
   ```bash  
   git clone https://github.com/your-username/worker-management.git  
   ```  

2. Navigate to the project directory:  
   ```bash  
   cd worker-management  
   ```  

3. Build the project using Maven:  
   ```bash  
   mvn clean install  
   ```  

4. Run the Spring Boot application:  
   ```bash  
   mvn spring-boot:run  
   ```  

5. Open the application in a browser:  
   ```  
   http://localhost:9090 
  -  You can change the port  by going to the application.properties.

## Usage  

- **Add Worker**: Navigate to the "Add Worker" page, fill out the form, and click "Submit."  
- **Search Worker**: Go to the "Search Worker" page, enter search criteria, and view the results.

## Problems Faced During projects
## Challenges and Solutions  

During the development of this project, several challenges were encountered and resolved. Below are the key issues and their solutions:  

### 1. **MySQL Server Configuration**  
- **Issue**: The application failed to run because the MySQL server was not started.  
- **Solution**: Ensure your MySQL server is running before launching the application.  
  1. Press `Windows + R` to open the Run dialog.  
  2. Type `services.msc` and press Enter.  
  3. Look for `MySQL` in the list of services.  
  4. If it is not running, right-click on it and select **Start**.  

### 2. **Dependency Management in Maven**  
- **Issue**: Build issues arose due to missing dependencies in the `pom.xml` file.  
- **Solution**: Verify that all required dependencies are properly added to the `pom.xml` file at the beginning of the project. This prevents runtime and build errors later.  

### 3. **Maven Build Issues**  
- **Issue**: Running `mvn clean install` failed to generate the JAR file, even though `mvn clean` succeeded.  
- **Solution**: Ensure Apache Maven is correctly installed and configured in your system's directory. Download and install Maven if it's missing, and set it up in your system's environment variables to resolve the issue.  

### 4. **Integrating Backend with Frontend**  
- **Issue**: Data fetching using the JavaScript `fetch` API sometimes returned a 404 error or failed to interact with the backend.  
- **Solution**:  
  - Verify that your endpoints in the backend are correctly mapped.  
  - Double-check the mappings in your controller and the attributes in your entity class.  
  - Ensure that the attribute names in your entity class match the frontend's expected names exactly, as they are case-sensitive.  
  - Debugging tools like Postman can be very helpful in testing backend endpoints before integrating them with the frontend.  

### 5. **Development Workflow**  
- **Issue**: Balancing backend and frontend development could be overwhelming without a structured approach.  
- **Solution**:  
  - Focus on building and testing backend logic first using tools like Postman or browser extensions for API testing.  
  - Once the backend is stable, integrate the frontend and handle the interaction between the two layers.  

These insights can help developers overcome similar issues while working on similar projects.  

### 6. **Database Configuration**  
- **Issue**: The application failed to connect to the database due to incorrect or missing MySQL server/database details.  
- **Solution**:  
  - Ensure the database connection details are correctly configured in the `application.properties` file. Below is an example of the necessary setup:  

    ```properties  
    # DataSource Setup  
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver  
    spring.datasource.url=jdbc:mysql://localhost:3306/workerdb  
    spring.datasource.username=root  
    spring.datasource.password=sonal  
    spring.jpa.hibernate.ddl-auto=update  
    spring.jpa.show-sql=true  
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect  
    ```  

  - Before running the application:  
    1. Create a database named `workerdb`.  
    2. You can use tools like MySQL Workbench or Azure Data Studio to execute SQL queries and manage the database.  

By ensuring these configurations are correct and the database is set up beforehand, you can avoid connection issues.  

![demo_worker](https://github.com/user-attachments/assets/d4747fac-edb2-4274-bee1-9f123f755bfc)

## Video demo

Click [here](./worker_management_system/demo.mp4) to watch the project demonstration.  


## License  
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.  

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)  
- [Maven Documentation](https://maven.apache.org/)  

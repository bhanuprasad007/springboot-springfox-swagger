# springboot-springfox-swagger
A demo application for swagger documentation with springfox for spring boot rest api.

### Introduction:
Documentation plays a crucial role in the development and maintenance of any software project, especially when it comes to Rest APIs.

Clear and comprehensive documentation is essential for developers to consume and integrate services effectively.

In this demo, let's explore how to integrate Springfox libraries with Spring Boot application to add documentation using swagger.

### Dependencies
* Java 8+
* spring-boot 2.2+
* springfox 3.0.0

### Getting Started
Before we add documentation, we need to start with spring boot application. We can create a new spring boot application or use existing one.

### Add springfox dependencies
With springfox 3.0.0, we can just add dependency `springfox-boot-starter` in spring boot applications.
This version of springfox seems does not work with spring-boot 3+ versions.

### Configuration
Create `Docket` bean to customize Swagger behavior. We can specify which API endpoints to include/exclude, set API information such as title, description, version, etc.

### Annotate Controllers
Annotate controllers with Swagger annotations (@Api, @ApiOperation, @ApiParam, etc.) to describe their purpose, parameters, responses, and error codes.

### Generating Documentation
Run the spring boot application and access API Docs at `http://localhost:8080/v2/api-docs`. 
We can also browse the interactive Swagger UI at `http://localhost:8080/swagger-ui/` to explore API endpoints.

### Conclusion
Springfox is one of the powerful tool for generating API documentation using swagger. 
While it provides great benefits, it is also essential to notice the potential risks of performance overhead, maintenance burden.
Springfox last release (v3.0.0) was on July 14, 2020.
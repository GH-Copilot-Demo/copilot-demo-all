# Java Spring Boot Application

## Demo Description
This demo contains a partially complete Java Spring Boot REST API. The application acts as a Contacts phonebook.\
**Included:**
- MySQL DB inside a docker container to interact with the api 
    - table is prepopulated with data on docker compose
- REST controller with one endpoint
- DB entity class
- Repository interface class
- One test case

**To be Completed in demo:**
- Remaining three endpoints outlined in the repository interface class
- Validation for endpoint calls
- Remaining test cases

### What does this demo show?
- Copilot takes into account neighboring or related files within a project
- Complete remaining REST endpoints with appropriate http responses
- Adds regex validation
- Add Spring integration test cases

# IMPORTANT Note Before starting
- Open this demo in codespaces and use the `.devcontainer/java-spring-boot-app/devcontainer.json`
    - You can use the default container however, there are post commands specific to this project that need to run
- Be mindful of possibly needing to adjust the demo based on Copilot suggestions as they can vary.
    - ex. different REST API endpoint names, be sure to adjust the test REST calls (GET/POST as well as names)
    - ex. different method names, be familiar with the app to know the tests are okay

### How is demo run?

1. The dev container postcreate command will start the mqsql db, so that step is complete
2. Open `ContactRepository.java` and `ContactController.java` and `ControllerIntegrationTest.java`
3. Explain: 
    - that the remaining interface methods need to be completed in the controller
    - that we can add some additional validations
    - then we will write test cases
5. Add the following comment on line 35, inside the `saveContact` method:
```java
 // check if email is already present in the database
```
```java 
// use regex to check that user phone is valid with 10 digits and dashes
```
6. Add new endpoints to the controller using the following comments
```java
// Get contact by email and return ok if found
```
```java
// Get all contacts and return ok if found
```
```java
// post delete contact by id and return ok if found
```
Make a slight modification to harden then endpoint
```java
// post delete contact by id and return ok if found, else return error
```
7. Add test cases to `ControllerIntegrationTest.java`
```java
// test get contact by email
```
```java
// test get all contacts
```
```java
// test delete contact by id
```
7. Package the application (this will also run the tests). Make sure you are in the java-spring-boot directory
```bash
mvn package
```
8. Run the application
```bash
java -jar target/contacts-app-0.0.1-SNAPSHOT.jar
```
9. Open a new terminal window in Codespaces
10. Test the new endpoints (**Note: Endpoints can be different depending on what Copilot generated**)

Endpoint for getting all contacts
```bash
curl http://localhost:8080/contacts/getall -w " %{http_code}\n"
```
Endpoint for test duplicate contacts
```bash
curl -X "POST" "http://localhost:8080/contacts/save" -w " %{http_code}\n" -H 'Content-Type: application/json; charset=utf-8' -d $'{ "name": "John", "email":"John@gmail.com", "phone": "555-435-2345" }'
```
Endpoint for test bad phone number
```bash
curl -X "POST" "http://localhost:8080/contacts/save" -w " %{http_code}\n" -H 'Content-Type: application/json; charset=utf-8' -d $'{ "name": "Pat", "email":"Pat@gmail.com", "phone": "555-435-54315355" }'
```
Endpoint for creating a new contact
```bash
curl -X "POST" "http://localhost:8080/contacts/save" -w " %{http_code}\n" -H 'Content-Type: application/json; charset=utf-8' -d $'{ "name": "Pat", "email":"Pat@gmail.com", "phone": "555-435-5431" }'
```
Endpoint for getting contact by email
```bash
curl http://localhost:8080/contacts/get?email=Pat@gmail.com -w " %{http_code}\n"
```
Endpoint for getting all contacts
```bash
curl http://localhost:8080/contacts/getall -w " %{http_code}\n"
```
Endpoint for deleting contact by id
```bash
curl -X "POST" "http://localhost:8080/contacts/delete?id=" -w " %{http_code}\n"
```
Endpoint for getting all contacts
```bash
curl http://localhost:8080/contacts/getall -w " %{http_code}\n"
```

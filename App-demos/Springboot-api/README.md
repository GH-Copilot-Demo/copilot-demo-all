# Springboot-api - Demo Flow
## Objective
- To demonstrate the code suggestions provided by GitHub Copilot
- Demonstrate the Springboot api devlopment in IntelliJ using the code suggestions provided by GitHub Copilot
- Demonstrate the JUnit test cases development in IntelliJ using the code suggestions provided by GitHub Copilot

Note: 
- if the suggestions are not aligned, start typing the code based on the requirement to get better suggestions
- [open Copilot](https://docs.github.com/en/copilot/getting-started-with-github-copilot/getting-started-with-github-copilot-in-visual-studio-code#seeing-multiple-suggestions-in-a-new-tab) to see the suggestions

## [Rewatch the demo](https://github.rewatch.com/video/9b2dbj5o6dx1rjq1-copilot-spring-boot-api-and-junit)

## Demo Script

- Open the demoapp project in IntelliJ
- Navigate to demoapp>src>main>java>com>example>demoapp>models
- Open the file CustomerCreditRating.java
- Type the following prompt to get the code suggestions
```
// Define credit report class for a customer with fields credit rating, credit limit, credit score, credit history
```
- Open the file CustomerPaymentReport.java
- Type the following prompt to get the code suggestions
```
// Define payment report class for a customer transaction id, transaction date, amount, merchant name
```
- Open the file Customer.java (Optional)
- Type the following prompts to get the code suggestions (Optional)

```
// define a method for validating customer email

// define a method for validating customer phone number
```
- Type the following prompts under properties section(Optional - shows the contextual object reference)
```
// add customer credit rating field
// add customer payment report field
```
- Type the following prompts under getters & setters section(Optional)
```
// define getter and setter for customer credit rating
// define getter and setter for customer payment report 
```
- Navigate to demoapp>src>main>java>com>example>demoapp>dao
- Open the file CustomerDao.java
- Type the following prompt to get the code suggestions
```
// define a method to return sample Customer data
```
- Navigate to demoapp>src>main>java>com>example>demoapp
- Open the file CustomerController.java
- Type the following prompt to get the code suggestions
```
// define a method to get customer details
```
- Open the file DemoappApplication.java
- Run the application and navigate to the new customer api endpoint to see the response
- Navigate to demoapp>src>test>java>com>example>demoapp
- Open the file DemoApplicationTests.java or add a new file as CustomerControllerTests.java
- Type the following prompt to add Unit Test cases for the Customer Controller
```
 // add unit test cases for customer api
```
- Run the test cases and see the results

Note: You can enhance the demo by adding database connectivity or reading data from the csv files; add multiple DAO classes and controllers; generate test cases to demonstrate the code suggestions provided by GitHub Copilot


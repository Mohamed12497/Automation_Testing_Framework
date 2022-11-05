# Automation_Testing_Framework
 
# AutomationTestFramework
This framework is implemented using page object model pattern to automate Registration and login process

The project works by running the TestNG.xml file as run as suite

Features needed:
- selenium
- Maven
- TestNG
- faker library


The project structure contains 2 packages, one for running test cases and the other for the framework implementaion

The src/main/java package contains 4 classes:

- Pagebase class that contains WebDriver instance (the parent class)
- Homepage class contains locaters and method to reach sign up page
- SignUpPage class that contains locaters, setters and getters for sign up page, in addition to the method for signing up function
- Loginpage class that contains locaters, setters and getters for login page, in addition to the method for login function

The src/test/java package contains 2 classes:

- TestBase class for initiating chrome driver then navigating to website (parent class)
- SignUpANDLogin class that contains 3 methods
  - the first one for generating data using faker library
  - the second one for sign up test case
  - and the third one for the login test case

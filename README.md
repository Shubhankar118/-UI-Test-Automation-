# -UI-Test-Automation-

## Project Structure


your-repo-name
│
├── src
│   └── test
│       └── java
│           └── testPackage
│               ├── baseClass
│               │   └── BasePage.java
│               └── testCases
│                   ├── LoginPage.java
│                   ├── SearchPage.java
│                   ├── CheckOutPage.java
│                   └── PaymentPageTest.java
│
├── src
│   └── test
│       └── resources
│           └── config
│               ├── config.properties
│               └── locators.properties
│
├── testng.xml
├── pom.xml
├── .gitignore
└── README.md


##Prerequisites
Before setting up the project, ensure that the following software is installed on your machine:

Java JDK (version 8 or higher)
Apache Maven (for dependency management)
Git (for version control)
IDE: IntelliJ IDEA, Eclipse, or any Java-compatible IDE
Browser Drivers: ChromeDriver, GeckoDriver (for Firefox), and EdgeDriver, corresponding to the browsers you intend to test
Installation
Clone the Repository


git clone 
cd your-repo-name
Import the Project into Your IDE

Open your preferred IDE.
Import the project as a Maven project.
Install Maven Dependencies

Maven will automatically handle dependencies specified in the pom.xml file. To manually trigger the installation, run:


mvn clean install
Configuration
1. config.properties
Located at src/test/resources/config/config.properties, this file contains essential configuration settings.

properties

# Browser Configuration: chrome, firefox, edge
browser=chrome

# Base URL of the application under test
testurl=https://example.com


Running the Tests
You can execute the tests using the testng.xml file through Maven or directly via your IDE.

Using Maven
Run the following command in the project root directory:


mvn test -Dsurefire.suiteXmlFiles=testng.xml
Using an IDE
Import the Project: Ensure the project is imported as a Maven project.
Run TestNG Suite:
Right-click on the testng.xml file.
Select Run As > TestNG Suite.
Test Execution Flow
Base Setup (BasePage.java)

Initializes the WebDriver based on the browser specified in config.properties.
Loads configuration and locator properties.
Navigates to the specified testurl.
Test Cases (testPackage.testCases)

LoginPage.java: Tests the login functionality.
SearchPage.java: Tests the search feature.
CheckOutPage.java: Tests the checkout process.
PaymentPageTest.java: Tests the payment workflow.
Teardown

After all tests are executed, the tearDown method in BasePage.java quits the WebDriver instance.


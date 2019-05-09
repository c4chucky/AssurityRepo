# Assurity API Test

This is a test I did for Assurity to send a Get request, parse and verify the response.

The application is written in Java 9, using the TestNG framework and REST Assured libraries.

## The test checks the Acceptance Criteria is as follows:

* Name = "Carbon credits"
* CanRelist = true
* The Promotions element with Name = "Gallery" has a Description that contains the text "2x larger image"

## Running the executable JAR file:

1. Clone the repository to the folder of choice.

2. Ensure that the Java JRE is installed of version 1.8 or higher. This can be found here: 
[https://www.java.com/en/download/win10.jsp](https://www.java.com/en/download/win10.jsp)

3. Run the file in the command line with the following command: _java -jar AssurityApiTest.jar_.

The four tests should run and display the following:

_RunAssurityApiTest_

_Total tests run: 4, Failures: 0, Skips: 0_


## Test Reports:

The test reports can be found in the "test-output" folder, as the "emailable-report.html" file.

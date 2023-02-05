package techproed;

public class notes {
}
/*
https://testng.org/doc/documentation-main.html

 */
/*
TestNG xml files:
What is it?
An xml file can be used for test case groups, and do configuration. For example, pom.xml is used to add dependencies. TestNG xml files are used to create custom test groups such as class level test groups, package level test groups,…
TestNG xml files are an alternative way of creating and running test cases.
Why did you use?
I used some xml files to run tests in parallel, set test priorities, and run specific test groups
How did you use in your current framework?
I used some xml files to run tests in parallel, set test priorities, and run specific test groups my current framework.
Data Provider:
What is it?
Data provider is a testNG functionality.
It is used to provide test data to the test cases in automation.
It returns the data as 2D array
Data provider has 2 parameters : name(to override the method name) and parallel(for doing parallel testing)
How did you use it?
I used it when I was using testNG framework. In fact, I used data provider to get some of the test data from the excel sheet. We store the login credentials in excel and used data provider to get the data from there. The benefit was I can get multiple data without any loop.
 */

/*
JUnit: A testing framework. Has less annotation compare to TestNG
TestNG: An advanced testing framework. Advanced version of JUnit framework
Page Object Model: Popular Framework Design. We use page  object model for
creating reusable page objects and methods.
Maven: Project built tool. With maven, we can easily add other dependencies
(junit,testng,selenium, faker, poi,…) to our project. Instead of importing the jar files,
we just add the dependency in the pom.xml file. Then maven automatically imports jar pies for us.
Developers may also use maven for their project built.
Selenium: Selenium is used to test web based application.
We can also do mobile testing with 3rd party tool such as appium.
 */
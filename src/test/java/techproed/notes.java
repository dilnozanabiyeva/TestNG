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
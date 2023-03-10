package techproed.tests.smoketest.logintests;


import org.testng.Reporter;
import org.testng.annotations.Test;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class Day18_PositiveLoginTest {

    /*
        Name: US100201_Admin_Login
        Description:
        User should be able login as admin
        Acceptance Criteria:
        As admin, I should be able to log in the application
        https://www.bluerentalcars.com/
        Admin email: jack@gmail.com
        Admin password: 12345
     */

    HomePage homePage;
    LoginPage loginPage;

    @Test
    public void US100201_Admin_Login(){
        Reporter.log("Going to the application URL");
 //going to blue rental car home page
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

 //click on home page login link
        homePage = new HomePage();
        loginPage = new LoginPage();
        ReusableMethods.waitFor(3);
        homePage.homePageLoginLink.click();
        ReusableMethods.waitFor(3);
        loginPage.userName.sendKeys("jack@gmail.com");
        ReusableMethods.waitFor(3);
        loginPage.password.sendKeys("12345");
        ReusableMethods.waitFor(3);
        loginPage.loginButton.click();
        ReusableMethods.waitFor(3);

 //Verify login is successful
        ReusableMethods.verifyElementDisplayed(homePage.userID);
        Driver.closeDriver();
        Reporter.log("Test is complete...");
    }
}

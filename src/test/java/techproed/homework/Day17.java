package techproed.homework;

import org.testng.annotations.Test;
import techproed.pages.OpenSourcePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day17 {

   /* HW:

 https://testcenter.techproeducation.com/index.php?page=form-authentication
 Login the application using page object model

 */

        @Test
        public void loginTest(){
            OpenSourcePage openSourcePage = new OpenSourcePage();
            Driver.getDriver().get(ConfigReader.getProperty("testcenter_URL"));
            openSourcePage.userName.sendKeys("techproed");
            openSourcePage.password.sendKeys("SuperSecretPassword");
            openSourcePage.submitButton.click();
        }

}

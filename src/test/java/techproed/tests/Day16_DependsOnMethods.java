package techproed.tests;
import org.testng.annotations.Test;
public class Day16_DependsOnMethods {

    @Test
    public void homePage(){
        System.out.println("I am on the home page");
    }

    @Test
    public void searchPage(){
        System.out.println("I am on the search page");
    }
/*
dependsOnMethods --> connecting one (dependent) method to another (independent);
if independent fails dependent doesn't execute.
Ex: dependsOnMethods = "searchPage"  -> connecting checkOutPage to searchPage
    searchPage will execute right before checkOutPage
    If searchPage PASS -> execute checkoutPage
    If searchPage FAIL -> SKIP checkoutPage
 */
    @Test(dependsOnMethods = "searchPage")
    public void checkOutPage(){
        System.out.println("I am on the checkout page");
    }
}


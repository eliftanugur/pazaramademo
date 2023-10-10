package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;


public class SmokeTest extends BasePage {


    @Test
    public void SmokeTest()  {

        LoginPage loginpage = new LoginPage();
        loginpage.loginPage("eliftanugur90@gmail.com", "Test1234");
        driver.get("https://www.pazarama.com/telsiz-aksesuarlari-k-K04251");
        loginpage.SelectCategory();
        loginpage.SelectMenu();
    }
}




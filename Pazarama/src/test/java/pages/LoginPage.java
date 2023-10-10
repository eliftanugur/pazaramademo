package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage extends BasePage{

    @FindBy(id = "Username")
    WebElement uname;

    @FindBy(id="Password")
    WebElement password;

    @FindBy(id = "submit-button")
    WebElement loginButton;

    @FindBy(xpath ="//ul[@class='flex h-17 relative z-40']/li")
    List<WebElement> categoryName;


    @FindBy(xpath = "//div[@productcode='440499999999']")
    WebElement likeIt;


    @FindBy(xpath ="//ul[@class='flex items-center']/li")
    List<WebElement> menus;





    public LoginPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void SelectCategory(){
        for (WebElement categoryList:categoryName){
            if (categoryList.getText().trim().equals("Elektronik")){
                categoryList.click();
                break;
            }
            String catName=categoryList.getText();
            System.out.println(catName);
            likeIt.click();

        }

    }

    public void SelectMenu(){
        for (WebElement favList: menus){
            if(favList.getText().trim().equals("Favorilerim")){
                favList.click();
                break;

            }
            String fv=favList.getText();
            System.out.println(fv);
        }
    }

    public LoginPage loginPage(String mail, String pass)  {
        uname.click();
        uname.sendKeys(mail);
        password.click();
        password.sendKeys(pass);
        loginButton.click();

        return this;
    }



}

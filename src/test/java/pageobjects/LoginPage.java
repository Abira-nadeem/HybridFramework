package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;// class object

    //creating a constructor that takes a parameter as webdriver alongside an object
    //constructor name should be same as classname
    public LoginPage(WebDriver driver){

        //here 'this' keyword is invoking current object in the class
        this.driver = driver;

        //pagefactory.initelements helps to create findelements call implicitly..
        PageFactory.initElements(driver,this);
    }

    // using annotations from page object model to find the webelements @findbby -- works like driver.find
    //elementby().. and cachelookup helps to keep the cache of webelement,instead of searching for the webelement
    //everytime for the same webpage ..this way it helps to save time and run tests faster
    @FindBy(id="txtUsername")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(id="txtPassword")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(id="btnLogin")
    @CacheLookup
    WebElement btnlogin;

    //make more constructors for passing values into the fields

    //constructor for username--
    public void setUsername(String uname){

        txtEmail.sendKeys(uname);
    }

    //constructor for password --
    public void setpassword(String upwd){

        txtPassword.sendKeys(upwd);
    }

    //constructor for login button --
    public void clickbtn(){

        btnlogin.click();
    }



}

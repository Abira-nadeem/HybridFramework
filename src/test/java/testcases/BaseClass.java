package testcases;

//make this class so that these methods and variables r re-usable

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import utilities.ReadConfig;
import java.io.IOException;

public class BaseClass {

    //to access readconfig class we need to make object for the readconfig  --
    ReadConfig readconfig = new ReadConfig();

    //write the url,email,pass in string format(write the methods used in read-config class)
    // and assign it to variables

    String baseUrl = readconfig.getUrl();
    String username = readconfig.getusername();
    String password = readconfig.getpassword();

    //making driver object --
    WebDriver driver;

    //throes io-exception helps maintain normal flow of the code incase an error occurs
    public BaseClass() throws IOException {}

    //The @BeforeClass annotated method executes before the first method of the current
    // class is invoked.
        @BeforeClass
        public void setupmethod () {

         //WebDriverManager helps to automate the browser setup in the Selenium code--
            WebDriverManager.chromedriver().setup();

         //here we r creating chromedriver(); instance and storing it in a variable called driver--
            driver = new ChromeDriver();

            // for maximizing the screen--
            driver.manage().window().maximize();
        }
    //The @AfterClass annotated method is invoked after the execution of the test
    // methods of the current class.
        @AfterTest
        public void teardown () {

        // to end the session --
            driver.quit();

        }
    }



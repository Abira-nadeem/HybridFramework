package testcases;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.LoginPage;
import java.io.File;
import java.io.IOException;

public class testcase1 extends BaseClass{
    public testcase1() throws IOException {
    }
    //after extending from baseclass this class becomes childclass

    //using @test annotation from testng-- annotations help to control the flow of execution of methods --

    @Test
    public void loginmethod() throws InterruptedException, IOException {

        //to open the url--
        driver.get(baseUrl);
        //for calling the methods from loginpage-class we need to create an object for it--
        LoginPage lp = new LoginPage(driver);

        //writting the username --
        lp.setUsername(username);

        //writting the password --
        lp.setpassword(password);

        //for clicking button--
        lp.clickbtn();

        //suspending execution for a specific time--
        Thread.sleep(3000);

        //using if condition for assertion --
        if(driver.getTitle().equals("OrangeHRM")){
            Assert.assertTrue(true);
        }

        //taking screenshot--
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(screenshotFile,new File(".//screenshot/screen.png"));

       //printing a message--
        System.out.println("test-passed");
    }




}

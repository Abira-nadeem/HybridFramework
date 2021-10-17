package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// this class will help read the data from 'config.properties'--
public class ReadConfig {

    //use a predefined class called properties and create an object called pro which will later be initialized
    //inside the constructor--
    Properties pro;

    //make a constructor with the same name as class name--

    public ReadConfig() throws IOException {

        //passing the path of config.properties file inside the new object
        File fi = new File("./configuration/config.properties");

        //fileinputstream is used whenever we want to read a file
        FileInputStream fis = new FileInputStream(fi);

        //pro.load method will help to load the config file in run time
        pro = new Properties();
        pro.load(fis);
    }

    //action method for reading url from config file --
    public String getUrl() {

        String weblink = pro.getProperty("baseUrl");
        return weblink;
    }

    //action method for reading username from config file --
    public String getusername() {

        String email = pro.getProperty("username");
        return email;
    }

    // action method for reading password from config file--
    public String getpassword() {

        String pwd = pro.getProperty("password");
        return pwd;
    }



}

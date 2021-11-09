# HybridFramework
## Table of Contents
1. [Introduction](#introduction)
2. [Requirments](#requirments)
3. [Installation](#installation)

--- INTRODUCTION ---

This project is used to present UI automation of a simple login test by using a selenium automation framework that is "hyrbid framework" using page object model. As 
per the page object model there is a seperate class for the test case, a seperate base class and utitlities class,properties.config.

Testbase class -- 
This class is responsible for loading the configuration by using "read.config" class like initialising the webdriver and terminating the session. This class drives 
the test scripts helps to perform all the actions like on which browser the script should be executed using "testng" and so this class holds all the functions that 
are commonly used by all pages.

Property Files(config.properties)-- 
This class holds the information which is static in nature and remains static throughout the entire framework such as browser name, application url.

Utilities/Readconfig.java--- 

This class holds all the functions that are commonly used across the entire framework.It helps to read the data from the config.properties file ,The main objective 
for creating this class is to achieve reusability.

Pageobject-class--- 

The pagefactory class is being used to initialize the webelements easily (@Findby).

Screenshot- 
A screenshot is captured to analyse the success/failure in test script.


---REQUIRMENTS----

Inorder to run the code in test cases we need to attach several libraries/dependencies since and here we are using maven so the depenedies are attached in the pom.
xml file from "https://mvnrepository.com/"

The dependencies needed are;
-selenuiumhq
-seleniumjava
-junit
-poi
-testng
-webdrivermanager
-testng


----INSTALLATION----
This project can be installed/downloaded by copying the link from "code" and cloning it in git bash by using the following command;

$ git clone https://example.com

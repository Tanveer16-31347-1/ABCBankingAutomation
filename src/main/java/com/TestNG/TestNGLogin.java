package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGLogin {
    public static WebDriver driver;

    @BeforeClass
    public static void launch_Chrome (){

        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();        //Maximize Window


        driver.get("http://demo.guru99.com/V4/index.php");      //OpenURL
    }

    @Test (description =  "valid Test Case " , priority = 0)
    public static void TC_Login_001() {


        WebElement UserId = driver.findElement(By.name("uid"));
        UserId.clear();
        UserId.sendKeys("mngr357168");


        WebElement Password = driver.findElement(By.name("password"));
        Password.clear();
        Password.sendKeys("qYmAjut");


        WebElement LoginBtn = driver.findElement(By.name("btnLogin"));
        LoginBtn.click();

        //Verification
        String Expected_Title = "Guru99 Bank Manager HomePage";
        String Actual_title = driver.getTitle();


        if (Expected_Title.equals(Actual_title)) {
            System.out.println("Test Case Passed.");
        } else {
            System.out.println("Test Case failed.");
        }

        //Logout
        WebElement Logout = driver.findElement(By.cssSelector("body > div:nth-child(7) > div > ul > li:nth-child(15) > a"));
        Logout.click();

        driver.switchTo().alert().accept(); //ok button


        System.out.println("TC_Login_001 Worked");
    }


            //UserId and pass invalid
    @Test (description =  "Invalid Test Case " , priority = 1)
    public static void TC_Login_002() {

        WebElement UserId =driver.findElement(By.name("uid"));
        UserId.clear();
        UserId.sendKeys("asdfg@ggmu.com");


        WebElement Password = driver.findElement(By.name("password"));
        Password.clear();
        Password.sendKeys("1234567");


        WebElement LoginBtn = driver.findElement(By.name("btnLogin"));
        LoginBtn.click();

        driver.switchTo().alert().accept(); //ok button for not valid

        //Verification
        String Expected_Title = "Guru99 Bank Home Page";
        String Actual_title = driver.getTitle();


        if (Expected_Title.equals(Actual_title)) {
            System.out.println("Test Case Passed & Account Successfully Login.");
        } else {
            System.out.println("Test Case failed");
        }



        System.out.println("TC_Login_002 Worked");
    }


            //UserId valid but pass invalid
    @Test(description =  "Invalid Test Case " , priority = 2)
    public static void TC_Login_003() {



        WebElement UserId = driver.findElement(By.name("uid"));
        UserId.clear();
        UserId.sendKeys("mngr357168");


        WebElement Password = driver.findElement(By.name("password"));
        Password.clear();
        Password.sendKeys("0012500");


        WebElement LoginBtn = driver.findElement(By.name("btnLogin"));
        LoginBtn.click();

        driver.switchTo().alert().accept(); //ok button for not valid

        //Verification
        String Expected_Title = "Guru99 Bank Home Page";
        String Actual_title = driver.getTitle();


        if (Expected_Title.equals(Actual_title)) {
            System.out.println("Test Case Passed.");
        } else {
            System.out.println("Test Case failed.");
        }


        System.out.println("TC_Login_003 Worked");


    }


            //UserId invalid but pass valid
    @Test (description =  "Invalid Test Case " , priority = 3)
    public static void TC_Login_004() {


        WebElement UserId = driver.findElement(By.name("uid"));
        UserId.clear();
        UserId.sendKeys("kazi 123");


        WebElement Password = driver.findElement(By.name("password"));
        Password.clear();
        Password.sendKeys("gaqAnEg");


        WebElement LoginBtn = driver.findElement(By.name("btnLogin"));
        LoginBtn.click();

        driver.switchTo().alert().accept(); //ok button for not valid

        //Verification
        String Expected_Title = "Guru99 Bank Home Page";
        String Actual_title = driver.getTitle();


        if (Expected_Title.equals(Actual_title)) {
            System.out.println("Test Case Passed.");
        } else {
            System.out.println("Test Case failed.");
        }


        System.out.println("TC_Login_004 Worked");


    }
    @AfterClass
    public static void close_Chrome (){

        driver.close();     // close tab

    }


}
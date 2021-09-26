package com.NewCustomer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.Base.TestBase.driver;

public class NewCustomerCreate {



    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        ChromeOptions opt=new ChromeOptions();
        opt.setAcceptInsecureCerts(true);
        driver=new ChromeDriver(opt);
        driver.manage().window().maximize();

        openURL("https://demo.guru99.com/v4/index.php");
        LogIn();
        //smallWait();
        TC_001();
        TC_002();
        TC_003();
//        TC_004();
//        TC_005();
//        TC_006();
//        TC_007();
//        TC_008();
//        TC_009();



    }

    private static void openURL(String s) {
    }

    public static void LogIn(){
        WebElement UserId= driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(1) > td:nth-child(2) > input[type=text]"));
        UserId.clear();
        UserId.sendKeys("Kazi354836");

        WebElement Password1= driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=password]"));
        Password1.clear();
        Password1.sendKeys("Kazsdsds");

        WebElement LoginBtn= driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        LoginBtn.click();

        WebElement NewCustomer= driver.findElement(By.cssSelector("body > div:nth-child(7) > div > ul > li:nth-child(2) > a"));
        NewCustomer.click();
    }

    public static void TC_001() {
        WebElement Name = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        Name.clear();
        Name.sendKeys("Kazi Tanveer");

        WebElement Gender = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        WebElement BirthDate = driver.findElement(By.cssSelector("#dob"));
        BirthDate.clear();
        BirthDate.sendKeys("15852846");

        WebElement Address = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        Address.clear();
        Address.sendKeys("Dhaka");

        WebElement City = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        City.clear();
        City.sendKeys("Dhaka");

        WebElement State = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        State.clear();
        State.sendKeys("Dhaka");

        WebElement Pin = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        Pin.clear();
        Pin.sendKeys("105022");

        WebElement Mobile = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        Mobile.clear();
        Mobile.sendKeys("01254897658");

        WebElement Email = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        Email.clear();
        Email.sendKeys("sifat@gmail.com");

        WebElement Password = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]"));
        Password.clear();
        Password.sendKeys("25498");

        WebElement Submit = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        Submit.click();

        String Expected_Tittle = "Guru99 Bank Customer Registration Page";
        String Actual_Tittle = driver.getTitle();
        if (Expected_Tittle.equals(Actual_Tittle)) {
            System.out.println("Test Case 01 Pass");
        } else {
            System.out.println("Test Case 01 Failed");
        }

        WebElement New_Customer = driver.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a"));
        New_Customer.click();

    }

    public static void TC_002() {
        WebElement Name = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        Name.clear();
        Name.sendKeys("Kazi tanveer Islahm hshshshshshshshshshshshshshshshshs");

        WebElement Gender = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        WebElement BirthDate = driver.findElement(By.cssSelector("#dob"));
        BirthDate.clear();
        BirthDate.sendKeys("001548796");

        WebElement Address = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        Address.clear();
        Address.sendKeys("Dhaka");

        WebElement City = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        City.clear();
        City.sendKeys("Dhaka");

        WebElement State = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        State.clear();
        State.sendKeys("Dhaka");

        WebElement Pin = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        Pin.clear();
        Pin.sendKeys("232021");

        WebElement Mobile = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        Mobile.clear();
        Mobile.sendKeys("015477877588");

        WebElement Email = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        Email.clear();
        Email.sendKeys("kazi55@gmail.com");

        WebElement Password = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]"));
        Password.clear();
        Password.sendKeys("031122");

        WebElement Submit = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        Submit.click();

        String Expected_Tittle = "Guru99 Bank Customer Registration Page";
        String Actual_Tittle = driver.getTitle();
        if (Expected_Tittle.equals(Actual_Tittle)) {
            System.out.println("Test Case 02 Pass");
        } else {
            System.out.println("Test Case 02 Failed");
        }

        WebElement New_Customer = driver.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a"));
        New_Customer.click();

    }

    public static void TC_003() {
        WebElement Name = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        Name.clear();
        Name.sendKeys("Kazi Tanveer");

        WebElement Gender = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        WebElement BirthDate = driver.findElement(By.cssSelector("#dob"));
        BirthDate.clear();
        BirthDate.sendKeys("04051995");

        WebElement Address = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        Address.clear();
        Address.sendKeys("Dhakaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");

        WebElement City = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        City.clear();
        City.sendKeys("Dhaka");

        WebElement State = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        State.clear();
        State.sendKeys("Dhaka");

        WebElement Pin = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        Pin.clear();
        Pin.sendKeys("101021");

        WebElement Mobile = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        Mobile.clear();
        Mobile.sendKeys("0175642684");

        WebElement Email = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        Email.clear();
        Email.sendKeys("KaziTanveer@gmail.com");

        WebElement Password = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]"));
        Password.clear();
        Password.sendKeys("333333");

        WebElement Submit = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        Submit.click();

        String Expected_Tittle = "Guru99 Bank Customer Registration Page";
        String Actual_Tittle = driver.getTitle();
        if (Expected_Tittle.equals(Actual_Tittle)) {
            System.out.println("Test Case 03 Pass");
        } else {
            System.out.println("Test Case 03 Failed");
        }

        WebElement New_Customer = driver.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a"));
        New_Customer.click();

    }

    public static void TC_004() {
        WebElement Name = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        Name.clear();
        Name.sendKeys("rashed Hasan");

        WebElement Gender = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        WebElement BirthDate = driver.findElement(By.cssSelector("#dob"));
        BirthDate.clear();
        BirthDate.sendKeys("12011990");

        WebElement Address = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        Address.clear();
        Address.sendKeys("Dhaka");

        WebElement City = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        City.clear();
        City.sendKeys("Dhakatttttttttttttttttttttttttttttttttttttt");

        WebElement State = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        State.clear();
        State.sendKeys("Dhaka");

        WebElement Pin = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        Pin.clear();
        Pin.sendKeys("171091");

        WebElement Mobile = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        Mobile.clear();
        Mobile.sendKeys("0160747679");

        WebElement Email = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        Email.clear();
        Email.sendKeys("dscsc@gmail.com");

        WebElement Password = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]"));
        Password.clear();
        Password.sendKeys("904321");

        WebElement Submit = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        Submit.click();

        String Expected_Tittle = "Guru99 Bank Customer Registration Page";
        String Actual_Tittle = driver.getTitle();
        if (Expected_Tittle.equals(Actual_Tittle)) {
            System.out.println("Test Case 04 Pass");
        } else {
            System.out.println("Test Case 04 Failed");
        }

        WebElement New_Customer = driver.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a"));
        New_Customer.click();


    }

    public static void TC_005() {
        WebElement Name = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        Name.clear();
        Name.sendKeys("risal Hasan");

        WebElement Gender = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        WebElement BirthDate = driver.findElement(By.cssSelector("#dob"));
        BirthDate.clear();
        BirthDate.sendKeys("08011997");

        WebElement Address = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        Address.clear();
        Address.sendKeys("Dhaka");

        WebElement City = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        City.clear();
        City.sendKeys("Dhaka");

        WebElement State = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        State.clear();
        State.sendKeys("Dhakaytttttttttttttzzzzzzzzzzzzwwwwweeeerrrrsssw");

        WebElement Pin = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        Pin.clear();
        Pin.sendKeys("101121");

        WebElement Mobile = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        Mobile.clear();
        Mobile.sendKeys("01532906753");

        WebElement Email = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        Email.clear();
        Email.sendKeys("zakaria@gmail.com");

        WebElement Password = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]"));
        Password.clear();
        Password.sendKeys("020202");

        WebElement Submit = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        Submit.click();

        String Expected_Tittle = "Guru99 Bank Customer Registration Page";
        String Actual_Tittle = driver.getTitle();
        if (Expected_Tittle.equals(Actual_Tittle)) {
            System.out.println("Test Case 05 Pass");
        } else {
            System.out.println("Test Case 05 Failed");
        }

        WebElement New_Customer = driver.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a"));
        New_Customer.click();

    }

    public static void TC_006() {
        WebElement Name = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        Name.clear();
        Name.sendKeys("faruk Hasan");

        WebElement Gender = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        WebElement BirthDate = driver.findElement(By.cssSelector("#dob"));
        BirthDate.clear();
        BirthDate.sendKeys("111011990");

        WebElement Address = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        Address.clear();
        Address.sendKeys("Dhaka");

        WebElement City = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        City.clear();
        City.sendKeys("Dhaka");

        WebElement State = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        State.clear();
        State.sendKeys("Dhaka");

        WebElement Pin = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        Pin.clear();
        Pin.sendKeys("1010211");

        WebElement Mobile = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        Mobile.clear();
        Mobile.sendKeys("0180356279");

        WebElement Email = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        Email.clear();
        Email.sendKeys("rajin@gmail.com");

        WebElement Password = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]"));
        Password.clear();
        Password.sendKeys("123456");

        WebElement Submit = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        Submit.click();

        String Expected_Tittle = "Guru99 Bank Customer Registration Page";
        String Actual_Tittle = driver.getTitle();
        if (Expected_Tittle.equals(Actual_Tittle)) {
            System.out.println("Test Case 06 Pass");
        } else {
            System.out.println("Test Case 06 Failed");
        }

        WebElement New_Customer = driver.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a"));
        New_Customer.click();

    }

    public static void TC_007() {
        WebElement Name = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        Name.clear();
        Name.sendKeys("Saoun Hasan");

        WebElement Gender = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        WebElement BirthDate = driver.findElement(By.cssSelector("#dob"));
        BirthDate.clear();
        BirthDate.sendKeys("03012002");

        WebElement Address = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        Address.clear();
        Address.sendKeys("Dhaka");

        WebElement City = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        City.clear();
        City.sendKeys("Dhaka");

        WebElement State = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        State.clear();
        State.sendKeys("Dhaka");

        WebElement Pin = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        Pin.clear();
        Pin.sendKeys("101032");

        WebElement Mobile = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        Mobile.clear();
        Mobile.sendKeys("01900765322790000");

        WebElement Email = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        Email.clear();
        Email.sendKeys("saoun@gmail.com");

        WebElement Password = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]"));
        Password.clear();
        Password.sendKeys("113333");

        WebElement Submit = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        Submit.click();

        String Expected_Tittle = "Guru99 Bank Customer Registration Page";
        String Actual_Tittle = driver.getTitle();
        if (Expected_Tittle.equals(Actual_Tittle)) {
            System.out.println("Test Case 07 Pass");
        } else {
            System.out.println("Test Case 07 Failed");
        }

        WebElement New_Customer = driver.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a"));
        New_Customer.click();

    }




}

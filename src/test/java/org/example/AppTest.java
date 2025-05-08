package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    WebDriver driver;
    @BeforeTest
    public void a(){
        //new comment
         driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");

    }
    @Test
    //abcd
    public void b(){
        String expectedTitle = "Create New Customer Account";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("Test Case passed");
        }
        else{
            System.out.println("Test Case Failed");
        }

    }
    @AfterTest
    public void c(){
        driver.close();
    }

}

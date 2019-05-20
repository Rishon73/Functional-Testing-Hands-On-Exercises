package com.mf;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.*;
import com.hpe.leanft.selenium.By;
import com.hpe.leanft.selenium.ByEach;
import java.util.HashMap;
import java.util.regex.Pattern;

public class SeleniumTest {

    WebDriver driver;

    @BeforeClass
    public void beforeClass() throws Exception {
    }

    @AfterClass
    public void afterClass() throws Exception {
    }

    @BeforeMethod
    public void beforeMethod() throws Exception {
        //driver = new FirefoxDriver(); // for Firefox testing
        /* OR */
        driver = new ChromeDriver(); // for Chrome testing
    }

    @AfterMethod
    public void afterMethod() throws Exception {
        driver.close();
    }

    @Test
    public void test() throws Exception {
        int waitTime = 2500; // 2.5 seconds
        driver.get("http://nimbusserver.aos.com:8000");
        /*
        * need to add wait calls (Selenium has other ways to synch page loading and objects)
        * we'll take the easy path ;-)
        * */

        Thread.sleep(waitTime);
        driver.findElement(By.id("tabletsImg")).click();

        Thread.sleep(waitTime);
        driver.findElement(By.visibleText("HP Elite x2 1011 G1 Tablet")).click();

        Thread.sleep(waitTime);
        driver.findElement(new ByEach(
                By.tagName("button"),
                By.visibleText("ADD TO CART")
        )).click();

        Thread.sleep(waitTime);
        driver.findElement(By.visibleText(Pattern.compile("CHECKOUT .*"))).click();
    }
}
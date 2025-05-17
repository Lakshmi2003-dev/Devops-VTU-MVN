package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("web driver.chrome.driver","./Drivers/chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("https://www.google.com");
        //driver.navigate().to("https://www.google.com");
        driver.quit();
    }

}


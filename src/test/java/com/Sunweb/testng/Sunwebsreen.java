package com.Sunweb.testng;

import jxl.Sheet;
import jxl.Workbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import sun.security.pkcs11.wrapper.Constants;


import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

public class Sunwebsreen {

    int i;

    public WebDriver driver;


    @BeforeTest
    public void openBrowser() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\I.GT\\Desktop\\git code\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maxmize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void launchBrowser() throws Exception {

        driver.get(SunwebConstant.baseUrl);

        WebElement element = (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button']")));
        element.click();
    }

}

package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Page01;
import utilities.ConfigReader;
import utilities.Driver;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.Key;
import java.util.List;
import java.util.Random;

import static org.openqa.selenium.Keys.ENTER;

public class GittigidiyorHomePage {

    @Test
    public void test() throws InterruptedException {
        Page01 page = new Page01();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty("title")));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(page.girisYap1).click().perform();
        Driver.getDriver().get("https://www.gittigidiyor.com/uye-girisi?s=1");

        page.emailAddressTextBox.sendKeys("stabanca61@gmail.com");
        page.passwordTextBox.sendKeys("Norvec34");
        page.girisYap.click();
        Thread.sleep(1000);
        page.arama.sendKeys("bilgisayar"+Keys.ENTER);
        actions.sendKeys(Keys.END)
                .sendKeys(Keys.PAGE_UP)
                .perform();

        page.nextPageButton.click();
        Thread.sleep(2000);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith("2"));
        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                perform();
        Thread.sleep(2000);
        page.secilenUrun.click();

        String path="TestiniumProject";
        FileInputStream fileInputStream= null;


        String beklenenFıyat=page.beklenenFiyat.getText();
        System.out.println(beklenenFıyat);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
         page.sepeteEkle.click();

         actions.moveToElement(page.sepetİsareti);
         page.sepetİsareti.click();



















    }

    }



package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AjaxPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjaxTest extends  TestBase {
    AjaxPage ajaxObject;

    @Test
    public void clickOnButtonAndWait15() throws InterruptedException {
        driver.navigate().to("http://www.uitestingplayground.com/ajax");
        ajaxObject = new AjaxPage(driver);
        ajaxObject.clickOnButtonTriggeringAJAX();
        Thread.sleep(15000);
        //WebDriverWait wait = new WebDriverWait(driver,30);
       // wait.until(ExpectedConditions.visibilityOfElementLocated((By) ajaxObject.labolText));
        Assert.assertTrue(ajaxObject.labolText.isDisplayed(), "Element is  displayed.");

    }

}

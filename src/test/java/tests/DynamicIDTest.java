package tests;

import org.testng.annotations.Test;
import pages.DynamicID;

public class DynamicIDTest extends TestBase{

    DynamicID dynamicIDObject;

    @Test
    public void clickOnDynamicId(){
        driver.navigate().to("http://www.uitestingplayground.com/dynamicid");
        dynamicIDObject = new DynamicID(driver);
        dynamicIDObject.clickOnDynamicID();
    }
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class DynamicID extends PageBase {

    public DynamicID(WebDriver driver){
       super(driver);
  }

    @FindBy (xpath = "//button[text()='Button with Dynamic ID']")
     WebElement dynamicID;
    public void  clickOnDynamicID(){
        dynamicID.click();
    }

}

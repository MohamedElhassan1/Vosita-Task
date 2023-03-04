package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.css.model.Value;
import org.openqa.selenium.support.FindBy;
import java.time.Duration;

public class ShadowDOM  extends PageBase{
    public ShadowDOM(WebDriver driver){
        super (driver);
    }

    //@    @FindBy (xpath = "/html/body/section/div/guid-generator//button[1]")
    //@    @FindBy (xpath = "//div/guid-generator//button[1]")

    @FindBy (id = "buttonGenerate")
    WebElement ButtonGenerate;
    @FindBy (id = "buttonCopy")
    WebElement ButtonCopy;
    @FindBy (id = "editField")
    WebElement InputField;

    public void createGuid() throws InterruptedException {
        Thread.sleep(5000);
        ButtonGenerate.click();
    }
    public void  copyGuid(){
        ButtonCopy.click();
    }

}

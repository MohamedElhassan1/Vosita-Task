package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.time.Duration;
public class AjaxPage extends PageBase {
    public AjaxPage(WebDriver driver){
        super(driver);
    }
    @FindBy(id = "ajaxButton")
    WebElement ButtonTriggeringAJAX ;
    @FindBy(xpath = "//*[@class='bg-success']")
    public WebElement labolText ;



    public void clickOnButtonTriggeringAJAX(){
        ButtonTriggeringAJAX.click();
    }

}

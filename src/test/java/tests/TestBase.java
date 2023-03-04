package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.util.concurrent.TimeUnit;
public class TestBase {
    public static WebDriver driver;
    @BeforeSuite
    public void startDriver() throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"..\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.uitestingplayground.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    //@AfterSuite
    //public  void  stopDriver(){
       // driver.quit();
   // }
}

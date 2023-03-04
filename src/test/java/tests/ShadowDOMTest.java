package tests;

import org.testng.annotations.Test;
import pages.ShadowDOM;

public class ShadowDOMTest extends TestBase{
    ShadowDOM shadowDOM;
    @Test
    public void generateAndCopyGuid() throws InterruptedException {
        driver.navigate().to("http://www.uitestingplayground.com/shadowdom");
        shadowDOM = new ShadowDOM(driver);
        shadowDOM.createGuid();

    }
}

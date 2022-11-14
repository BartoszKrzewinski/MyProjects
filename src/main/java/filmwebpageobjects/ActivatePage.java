package filmwebpageobjects;

import dev.failsafe.internal.util.Assert;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActivatePage {

    private final WebDriver driver;

    public ActivatePage(WebDriver driver) {
        this.driver = driver;
    }


    public String displayActivatePage() {
        WebElement activateText = driver.findElement(By.xpath("//*[@id=\"site\"]/div[2]/div/div/div[1]/div[1]/h2"));
//        Assert.isTrue(activateText.isDisplayed(), "AKTYWUJ KONTO!");
        return activateText.getText();


    }


}

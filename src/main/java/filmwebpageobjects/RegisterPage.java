package filmwebpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {

    private final WebDriver driver;

    private final String URL = "https://www.filmweb.pl/register";

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public RegisterPage openPage() {
        driver.get(URL);
        return this;
    }

    public FormPage addNickEmailPass (String nickname, String email, String password) throws InterruptedException {

        driver.getWindowHandle();
        WebElement acceptBtn = driver.findElement(By.xpath("//button[@id='didomi-notice-agree-button']"));
        acceptBtn.click();
        WebElement nickInput = driver.findElement(By.xpath("//input[@class='materialForm__input materialForm__input--icon']"));
        nickInput.sendKeys(nickname);
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys(email);
        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));
        passwordInput.sendKeys(password);
        WebElement continueBtn = driver.findElement(By.className("authButton__text"));
        Thread.sleep(1000);
        continueBtn.click();
        return new FormPage(driver);


    }

}

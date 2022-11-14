package filmwebpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {

    private final WebDriver driver;

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    public ActivatePage fillForm (String firstname, String lastname) throws InterruptedException {
        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.sendKeys(firstname);
        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.sendKeys(lastname);
        WebElement gender = driver.findElement(By.xpath("//span[contains(text(), 'mężczyzna')]"));
        gender.click();
        WebElement birthYear = driver.findElement(By.cssSelector("button.dateInput__input"));
        birthYear.click();
        Thread.sleep(1000);
        WebElement nnn = driver.findElement(By.xpath("//span[contains(text(), '1990')]"));
        nnn.click();
        WebElement terms = driver.findElement(By.xpath("//*[@id=\"site\"]/div[2]/div/div/div[1]/div/form/fieldset[2]/div/div[1]/div[4]/div[1]/div/div[1]/label[1]/div"));
        terms.click();
        WebElement create = driver.findElement(By.xpath("//*[@id=\"site\"]/div[2]/div/div/div[1]/div/form/fieldset[2]/div/div[2]/button"));
        create.click();
        return new ActivatePage(driver);
    }

}

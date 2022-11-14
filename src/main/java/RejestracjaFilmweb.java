import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;

public class RejestracjaFilmweb {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.filmweb.pl/register");
        driver.getWindowHandle();
        WebElement acceptBtn = driver.findElement(By.xpath("//button[@id='didomi-notice-agree-button']"));
        acceptBtn.click();
        WebElement nickName = driver.findElement(By.xpath("//input[@class='materialForm__input materialForm__input--icon']"));
        nickName.sendKeys("Ryaszka123");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("razrazrggazrazraz@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("Loteria1234");
        WebElement continuedReg = driver.findElement(By.className("authButton__text"));
        Thread.sleep(1000);
        continuedReg.click();;
        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.sendKeys("Ryszard");
        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.sendKeys("Ryszkiewicz");
        WebElement gender = driver.findElement(By.xpath("//span[contains(text(), 'mężczyzna')]"));
        gender.click();
//        Thread.sleep(1000);
        WebElement birthYear = driver.findElement(By.cssSelector("button.dateInput__input"));
        birthYear.click();
        Thread.sleep(1000);
        WebElement nnn = driver.findElement(By.xpath("//span[contains(text(), '1990')]"));
        nnn.click();
        WebElement terms = driver.findElement(By.xpath("//*[@id=\"site\"]/div[2]/div/div/div[1]/div/form/fieldset[2]/div/div[1]/div[4]/div[1]/div/div[1]/label[1]/div"));
        terms.click();
        WebElement create = driver.findElement(By.xpath("//*[@id=\"site\"]/div[2]/div/div/div[1]/div/form/fieldset[2]/div/div[2]/button"));
        create.click();



    }
}

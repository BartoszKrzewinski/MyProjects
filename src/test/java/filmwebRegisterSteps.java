import filmwebpageobjects.ActivatePage;
import filmwebpageobjects.FormPage;
import filmwebpageobjects.RegisterPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.DataFaker;

import java.time.Duration;

public class filmwebRegisterSteps {

    private final String NICKNAME = DataFaker.createRandomNickname();
    private final String EMAIL = DataFaker.createRandomEmail();
    private final String PASSWORD = DataFaker.createRandomPassword();

    private final String FIRSTNAME = DataFaker.createRandomFirstName();

    private final String LASTNAME = DataFaker.createRandomLastName();

    private WebDriver driver;
    private RegisterPage registerPage;
    private FormPage formPage;
    private ActivatePage activatePage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }

    @Given("user is on register page")
    public void openPage() {
        registerPage = new RegisterPage(driver);
        registerPage.openPage();

    }

    @And("user add nickname, email and password")
    public void addNickEmailPass() throws InterruptedException {
        formPage = registerPage.addNickEmailPass(NICKNAME, EMAIL, PASSWORD);

    }

    @When("user fill the form")
    public void fillForm() throws InterruptedException {
        activatePage = formPage.fillForm(FIRSTNAME, LASTNAME);

    }

    @Then("new account will be created")
    public void accCreated () {

        activatePage.displayActivatePage();


    }

}

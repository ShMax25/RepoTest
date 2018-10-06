package YahooSearch;

import logingExcersize.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Yahoo {


    private WebDriver driver; // modification


    @BeforeTest(groups = {"fast"})

    public void setupBrovser () {
            System.setProperty("webdriver.gecko.driver", "/Users/msmuli/IdeaProjects/JavaBootcamp/src/test/resources/geckodriver");
            driver = new FirefoxDriver();
        }


    @Test (groups = {"fast"})
    public void testSearch() {

        MainPage mnpg = new MainPage();

        mnpg.navigatingToMainPage(driver);
        mnpg.typeRequestInSearchInput("Some text for search", driver);
        mnpg.submitSearch(driver);
        mnpg.printOutAmountOfResoults(driver);
    }

//    private void printOutAmountOfResoults() {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        String stat = driver.findElement(MainPage.result).getText();
//        System.out.println(stat);
//    }

//    private void submitSearch() {
//        driver.findElement(MainPage.searchButton).click();
//    }

//    private void typeRequestInSearchInput() {
//        driver.findElement(MainPage.search).sendKeys(MainPage.text);
//    }

//    private void navigatingToMainPage() {
//        driver.get("https://www.yahoo.com/");
//
//    }


}

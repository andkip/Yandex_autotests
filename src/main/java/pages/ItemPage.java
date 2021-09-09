package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

import static org.junit.Assert.assertEquals;

public class ItemPage extends BasePageObject {
    public static int numsActual;
    public static String rememberedVar;

    @FindBy(xpath = "//span[text() = 'Все фильтры']")
    public WebElement buttonAllFilters;

    @FindBy(xpath = "//input[@id='header-search']")
    WebElement headerSearch;

    @FindBy(xpath = "//span[text()='Найти']/..")
    public WebElement search;

    public void countOfItems() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        numsActual = BaseSteps.getDriver().findElements(By.xpath("//article//h3/a")).size();

    }

    public void rememberVariable(int num) {
        rememberedVar = BaseSteps.getDriver().findElement(By.xpath("(//article//h3/a)[" + num + "]")).getAttribute("title");
    }

    public void fillSearchWithVar() {
        headerSearch.sendKeys(rememberedVar);
    }

    public void matchedItemAndVar(int num) {
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 10, 1000);
        wait.until(ExpectedConditions.visibilityOf(BaseSteps.getDriver().findElement(By.xpath("(//article//h3/a)[" + num + "]"))));
        String foundTitle = BaseSteps.getDriver().findElement(By.xpath("(//article//h3/a)[" + num + "]")).getAttribute("title");
        assertEquals(rememberedVar, foundTitle);
        assertEquals(String.format("Значение элемента - [%s]. Ожидалось - [%s]",
                foundTitle, rememberedVar), foundTitle, rememberedVar);
    }
}

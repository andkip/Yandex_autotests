package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import pages.FiltersPage;
import ru.yandex.qatools.allure.annotations.Step;

public class FiltersPageSteps {

    @Step("указано значение фильтра \"От\": {0}")
    public void setMinimalPriceFilter(String value) {
       new FiltersPage().priceFrom.sendKeys(value);
    }
    @Step("выбран производитель {0}")
    public void chooseProducer(String producer) {
        ((JavascriptExecutor) BaseSteps.getDriver()).executeScript("arguments[0].scrollIntoView(true);", BaseSteps.getDriver()
                .findElement(By.xpath("//*[text()='"+producer+"']/../div")));
        BaseSteps.getDriver()
                .findElement(By.xpath("//*[text()='"+producer+"']/../div"))
                .click();;
    }
    @Step("выполнено нажатие на Показать")
    public void clickShowButton() {
        new FiltersPage().showButton.click();
    }

}

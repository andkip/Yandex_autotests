package steps;

import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.ArrayList;

public class MainYandexPageSteps {

    @Step("выбран пункт меню {0}")
    public void selectMenuItem(String menuItem) {
        BaseSteps.getDriver()
                .findElement(By.xpath("//div[@class='services-new__item-title' and text()='" + menuItem + "']"))
                .click();
        ArrayList<String> windows = new ArrayList<String>(BaseSteps.getDriver().getWindowHandles());
        BaseSteps.getDriver().close();
        BaseSteps.getDriver().switchTo().window(windows.get(1));
    }
}

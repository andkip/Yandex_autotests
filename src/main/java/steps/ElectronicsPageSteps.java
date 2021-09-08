package steps;

import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;

public class ElectronicsPageSteps {

    @Step("выбран подраздел {0}")
    public void selectSubSection(String menuItem) {
        BaseSteps.getDriver()
                .findElement(By.xpath("//div[text()='"+menuItem+"']/../../div"))
                .click();;
    }
}

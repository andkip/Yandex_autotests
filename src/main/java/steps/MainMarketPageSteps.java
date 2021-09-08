package steps;

import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;

public class MainMarketPageSteps {

    @Step("выбран раздел {0}")
    public void selectSection(String menuName) {
        BaseSteps.getDriver().findElement(By.xpath("//a[@class='_3Lwc_']/span[text()='"+menuName+"']"))
                .click();
    }
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FiltersPage extends BasePageObject {

    @FindBy(xpath = "(//h4[contains(text(),'Цена')]/../following-sibling::div//input)[1]")
    public WebElement priceFrom;

    @FindBy(xpath = "//a[contains(text(),'Показать')]")
    public WebElement showButton;

}


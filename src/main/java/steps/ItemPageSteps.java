package steps;

import pages.ItemPage;
import ru.yandex.qatools.allure.annotations.Step;
import static org.junit.Assert.assertEquals;

public class ItemPageSteps {

    @Step("выполнено нажатие на Все фильтры")
    public void clickButtonAllFilters() {
        new ItemPage().buttonAllFilters.click();
    }

    @Step("количество элементов на странице {0}")
    public void countOfItems(int expectedNumberOfItems) {
        new ItemPage().countOfItems();

        int numsActual = new ItemPage().numsActual;
        assertEquals(String.format("Товаров на странице - [%s]. Ожидалось - [%s]",
                numsActual, expectedNumberOfItems), numsActual, expectedNumberOfItems);
    }

    @Step("запомнить в переменную значение элемента с индексом {0}")
    public void rememberVariable(int num) {
        new ItemPage().rememberVariable(num);
    }

    @Step("ввести в поиск значение переменной")
    public void fillSearchWithVar() {
        new ItemPage().fillSearchWithVar();
    }

    @Step("выполнено нажатие на Найти")
    public void clickSearch() {
        new ItemPage().search.click();
    }

    @Step("значение элемента с индексом {0} соответствует значению переменной")
    public void matchedItemAndVar(int num) {
        new ItemPage().matchedItemAndVar(num);
    }
}

package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioSteps {

    MainYandexPageSteps mainYandexPageSteps = new MainYandexPageSteps();

    MainMarketPageSteps mainMarketPageSteps = new MainMarketPageSteps();

    ElectronicsPageSteps electronicsPageSteps = new ElectronicsPageSteps();

    ItemPageSteps itemPageSteps = new ItemPageSteps();

    FiltersPageSteps filtersPageSteps = new FiltersPageSteps();

    @When("^выбран пункт меню \"(.+)\"$")
    public void selectMenuItem(String menuName) {
        mainYandexPageSteps.selectMenuItem(menuName);
    }

    @When("^выбран раздел \"(.+)\"$")
    public void selectSection(String menuName) {
        mainMarketPageSteps.selectSection(menuName);
    }

    @When("^выбран подраздел \"(.+)\"$")
    public void selectSubSection(String menuName) {
        electronicsPageSteps.selectSubSection(menuName);
    }

    @When("^выполнено нажатие на Все фильтры$")
    public void clickButtonAllFilters() {
        itemPageSteps.clickButtonAllFilters();
    }

    @Then("^указано значение фильтра От:\"(.+)\"$")
    public void setMinimalPriceFilter(String value) {
        filtersPageSteps.setMinimalPriceFilter(value);
    }

    @Then("^выбран производитель \"(.+)\"$")
    public void chooseProducer(String checkbox) {
        filtersPageSteps.chooseProducer(checkbox);
    }

    @When("^выполнено нажатие на Показать$")
    public void clickShowButton() {
        filtersPageSteps.clickShowButton();
    }

    @When("^количество элементов на странице \"(.+)\"$")
    public void countOfItems(Integer numbers) {
        itemPageSteps.countOfItems(numbers);
    }

    @When("^запомнить в переменную значение элемента с индексом \"(.+)\"$")
    public void rememberVariable(Integer numbers) {
        itemPageSteps.rememberVariable(numbers);
    }

    @When("^ввести в поиск значение переменной$")
    public void fillSearchWithVar() {
        itemPageSteps.fillSearchWithVar();
    }

    @When("^выполнено нажатие на Найти$")
    public void clickSearch() {
        itemPageSteps.clickSearch();
    }

    @When("^значение элемента с индексом \"(.+)\" соответствует значению переменной$")
    public void matchedItemAndVar(Integer numbers) {
        itemPageSteps.matchedItemAndVar(numbers);
    }



}

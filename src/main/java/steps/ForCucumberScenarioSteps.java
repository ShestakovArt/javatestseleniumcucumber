//package steps;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.When;
//
//public class ForCucumberScenarioSteps {
//
//    MainSteps mainSteps = new MainSteps();
//
//    InsuranceSteps insuranceSteps = new InsuranceSteps();
//
//    InsuranceTravelSteps insuranceTravelSteps = new InsuranceTravelSteps();
//
//    ProductsTravelInsuranceSteps productsTravelInsuranceSteps = new ProductsTravelInsuranceSteps();
//
//    @When("^выбран пункт меню \"(.*)\"$")
//    public void stepSelectMainMenu(String menuItem){
//        mainSteps.selectMenuItem(menuItem);
//    }
//
//    @When("^выбран подпункт \"(.*)\"$")
//    public void stepSelectSubMenu(String menuItem){
//        mainSteps.selectSubMenu(menuItem);
//    }
//
//    @When("^выбран фильтр \"(.*)\"$")
//    public void stepSelectFilter(String filterItem){
//        insuranceSteps.selectFilter(filterItem);
//    }
//
//    @When("^выбран продукт \"(.*)\"$")
//    public void stepSelectTitel(String titelItem){
//        insuranceSteps.selectTitel(titelItem);
//    }
//
//    @When("^проверяем титульное название страницы \"(.*)\"$")
//    public void checkPageTitel(String checkItem){
//        insuranceTravelSteps.checkPageTitle(checkItem);
//    }
//
//    @When("^Нажимаем на кнопку \"Оформить онлайн\"")
//    public void clickButtonApply(){
//        insuranceTravelSteps.buttonClick();
//    }
//
//    @When("^проверяем выбор плана \"(.*)\"$")
//    public void checkPayment(String checkItem){
//        productsTravelInsuranceSteps.amountInsuranceCoverage(checkItem);
//    }
//
//    @When("^Нажимаем на кнопку \"(.*)\"$")
//    public void clickButtonApplyProduct(String buttonName){
//        productsTravelInsuranceSteps.buttonClick(buttonName);
//    }
//
//    @When("^Заполняем поля: ")
//    public void stepFillFields(DataTable fields){
//        fields.asMap(String.class, String.class).forEach(
//                (key, value) -> productsTravelInsuranceSteps.fillField(key, value)
//        );
//    }
//
//    @When("^Проверяем наличия сообщения у незаполненных полей \"(.*)\"$")
//    public void checkErrorMessage(String fieldName){
//        productsTravelInsuranceSteps.checkErrorMessageField(fieldName, "Поле не заполнено.");
//    }
//
//    @When("^Проверяем наличия сообщения об ошибке при заполнении полей \"(.*)\"$")
//    public void checkError(){
//        productsTravelInsuranceSteps.checkError("При заполнении данных произошла ошибка");
//    }
//}

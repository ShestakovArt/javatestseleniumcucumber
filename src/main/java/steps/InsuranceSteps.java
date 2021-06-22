package steps;

import io.cucumber.java.ru.Когда;
import pages.InsurancePages;

public class InsuranceSteps {

    @Когда("выбран фильтр {string}")
    public void selectFilter (String filterItem){
        new InsurancePages().selectFilter(filterItem);
    }

    @Когда("выбран продукт {string}")
    public void selectTitel (String filterItem){
        new InsurancePages().selectTitel(filterItem);
    }
}

package steps;

import io.cucumber.java.ru.Когда;
import pages.InsuranceTravelPages;

public class InsuranceTravelSteps {


    @Когда("проверяем титульное название страницы {string}")
    public void проверяем_титульное_название_страницы(String string) {
        new InsuranceTravelPages().checkPageTitle(string);
    }

    @Когда("Нажатие кнопки \"Оформить онлайн\"")
    public void buttonClick (){
        new InsuranceTravelPages().buttonClick();
    }
}

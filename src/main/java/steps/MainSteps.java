package steps;

import io.cucumber.java.ru.Когда;
import pages.MainPages;

public class MainSteps {

    @Когда("выбран пункт меню {string}")
    public void selectMenuItem (String mainMenu){
        new MainPages().selectMainMenu(mainMenu);
    }

    @Когда("выбран подпункт {string}")
    public void selectSubMenu (String mainMenu){
        new MainPages().selectSubMenu(mainMenu);
    }
}

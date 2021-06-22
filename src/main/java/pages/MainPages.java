package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPages extends BasePage{

    @FindBy (xpath = "//ul[contains(@class, 'list_center')]")
    WebElement mainMenu;

    @FindBy (xpath = "//div[@id ='kitt-top-menu-8-5']/../../../../div[contains(@class, 'subaction')]/ul")
    WebElement subMenu;

    public void selectMainMenu (String menuItem){
        mainMenu.findElement(By.xpath(".//a[@aria-label = '" + menuItem + "']")).click();
    }

    public void selectSubMenu (String menuItem){
        subMenu.findElement(By.xpath("./li/a[contains(text(), '" + menuItem + "')]")).click();
    }
}

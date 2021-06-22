package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InsurancePages extends BasePage {

    @FindBy (xpath = "//div[@aria-label='Фильтрация карт']")
    WebElement filter;

    @FindBy (xpath = "//div[@class='uc-full__item']")
    WebElement titelFilter;

    public void selectFilter (String filterItem){
        filter.findElement(By.xpath(".//label[contains(text(), '" + filterItem + "')]")).click();
    }

    public void selectTitel (String filterItem){
        titelFilter.findElement(By.xpath(".//*[contains(text(), '" + filterItem + "')]")).click();
    }
}

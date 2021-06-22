package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

public class InsuranceTravelPages extends BasePage{

    @FindBy(xpath = "//h1[@data-test-id = 'PageTeaserDict_header']")
    WebElement titelTravelPages;

    @FindBy(xpath = "//a[@data-test-id ='PageTeaserDict_button']")
    WebElement buttonApplyOnline;

    public String getTitelTravelPages (){
        return titelTravelPages.getText();
    }

    public void checkPageTitle (String expectedTitle){
        String actualTitle = getTitelTravelPages();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]", actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

    public void buttonClick (){
        buttonApplyOnline.click();
    }
}

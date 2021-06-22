package pages;


import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ProductsTravelInsurancePages extends BasePage{

    @FindBy(xpath = "//fieldset[@class = 'no-offset non-border']//h3[@_ngcontent-c11]")
    WebElement titelTravelPages;

    @FindBy(xpath = "//button[contains(text(), 'Оформить')]")
    WebElement buttonApply;

    @FindBy(id = "surname_vzr_ins_0")
    WebElement surname_vzr;

    @FindBy(id = "name_vzr_ins_0")
    WebElement name_vzr;

    @FindBy(id = "birthDate_vzr_ins_0")
    WebElement birthDate_vzr;

    @FindBy(id = "person_lastName")
    WebElement person_lastName;

    @FindBy(id = "person_firstName")
    WebElement person_firstName;

    @FindBy(id = "person_middleName")
    WebElement person_middleName;

    @FindBy(id = "person_birthDate")
    WebElement person_birthDate;

    @FindBy(xpath = "//label[contains(text(), 'Женский')]")
    WebElement person_gender;

    @FindBy(id = "passportSeries")
    WebElement passportSeries;

    @FindBy(id = "passportNumber")
    WebElement passportNumber;

    @FindBy(id = "documentDate")
    WebElement documentDate;

    @FindBy(id = "documentIssue")
    WebElement documentIssue;

    @FindBy(xpath = "//button[contains(text(), 'Продолжить')]")
    WebElement buttonContinue;

    @FindBy(name = "phone")
    WebElement modulePhone;

    @FindBy(name = "email")
    WebElement moduleEmail;

    @FindBy(name = "repeatEmail")
    WebElement moduleRepeatEmail;

    @FindBy(xpath = "//div[@class ='alert-form alert-form-error']")
    WebElement moduleErrorMessage;

    public String getTitelTravelPages (){
        return titelTravelPages.getText();
    }

    public void amountInsuranceCoverage (String expectedTitle){
        String actualTitle = getTitelTravelPages();
        assertTrue(String.format("Сумма страховой защиты [%s]. Ожидалось - [%s]", actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

    public void buttonClick (String buttonName){
        switch (buttonName){
            case("Оформить"):
                buttonApply.click();
                break;
            case ("Продолжить"):
                buttonContinue.click();
                break;
        }
    }

    public void fillField(String fieldName, Object value){
        switch (fieldName){
            case("Фамилия(Застрахованные)"):
                fillField(surname_vzr, (String) value);
                break;
            case("Имя(Застрахованные)"):
                fillField(name_vzr, (String) value);
                break;
            case("Дата рождения(Застрахованные)"):
                fillField(birthDate_vzr, (String) value);
                break;
            case("Фамилия(Страхователь)"):
                fillField(person_lastName, (String) value);
                break;
            case("Имя(Страхователь)"):
                fillField(person_firstName, (String) value);
                break;
            case("Отчество(Страхователь)"):
                fillField(person_middleName, (String) value);
                break;
            case("Дата рождения(Страхователь)"):
                fillField(person_birthDate, (String) value);
                break;
            case("Серия паспорта(Страхователь)"):
                fillField(passportSeries, (String) value);
                break;
            case("Номер паспорта(Страхователь)"):
                fillField(passportNumber, (String) value);
                break;
            case("Дата выдачи(Страхователь)"):
                fillField(documentDate, (String) value);
                break;
            case("Кем выдан(Страхователь)"):
                fillField(documentIssue, (String) value);
                break;
        }
    }

    public void fillFields(DataTable fields){
        fields.asMap(String.class, String.class).forEach((k, v)-> fillField((String) k,v));
    }

    public void randomGender() {
        Random random = new Random();
        int rand = random.nextInt(2);
        if (rand == 1) person_gender.click();
    }

    public String getFieldAttribute (String fieldName){
        String valueAttribute = "";
        switch (fieldName){
            case("Фамилия(Застрахованные)"):
                valueAttribute = surname_vzr.getAttribute("value");
                break;
            case("Имя(Застрахованные)"):
                valueAttribute = name_vzr.getAttribute("value");
                break;
            case("Дата рождения(Застрахованные)"):
                valueAttribute = birthDate_vzr.getAttribute("value");
                break;
            case("Фамилия(Страхователь)"):
                valueAttribute = person_lastName.getAttribute("value");
                break;
            case("Имя(Страхователь)"):
                valueAttribute = person_firstName.getAttribute("value");
                break;
            case("Отчество(Страхователь)"):
                valueAttribute = person_middleName.getAttribute("value");
                break;
            case("Дата рождения(Страхователь)"):
                valueAttribute = person_birthDate.getAttribute("value");
                break;
            case("Серия паспорта(Страхователь)"):
                valueAttribute = passportSeries.getAttribute("value");
                break;
            case("Номер паспорта(Страхователь)"):
                valueAttribute = passportNumber.getAttribute("value");
                break;
            case("Дата выдачи(Страхователь)"):
                valueAttribute = documentDate.getAttribute("value");
                break;
            case("Кем выдан(Страхователь)"):
                valueAttribute = documentIssue.getAttribute("value");
                break;
        }
        return valueAttribute;
    }

    public void checkFillFields(DataTable fields){
        fields.asMap(String.class, String.class).forEach((k, v)-> checkFillField((String) k,v));
    }

    public void checkFillField(String field, Object value) {
        String actual = new ProductsTravelInsurancePages().getFieldAttribute(field);
        assertEquals(String.format("Значение поля [%s] равно [%s]. Ожидалось - [%s]", field, actual, value), actual, value);
    }

    public void checkControlMessage(String nameField){
        String checkField = new String();
        String controlMessage = "Поле не заполнено.";
        switch (nameField){
            case("Мобильный телефон"):
                checkField = modulePhone.findElement(By.xpath(".//*[@class = 'invalid-validate form-control__message']")).getText();
                break;
            case("Электронная почта"):
                checkField = moduleEmail.findElement(By.xpath(".//*[@class = 'invalid-validate form-control__message']")).getText();
                break;
            case("Повтор электронной почты"):
                checkField = moduleRepeatEmail.findElement(By.xpath(".//*[@class = 'invalid-validate form-control__message']")).getText();
                break;
        }
        assertEquals(controlMessage, checkField);
    }

    public void checkErrorMesage (){
        String errorMessage = "При заполнении данных произошла ошибка";
        if(errorMessage.contains(moduleErrorMessage.getText())){
            assertEquals(errorMessage, moduleErrorMessage.getText());
        }
    }
}

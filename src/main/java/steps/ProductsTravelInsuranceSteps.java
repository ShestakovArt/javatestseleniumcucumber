package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.ru.Когда;
import pages.ProductsTravelInsurancePages;

public class ProductsTravelInsuranceSteps {

    @Когда("Проверяем выбор покрытия {string}")
    public void checkCoverage(String string) {
        new ProductsTravelInsurancePages().amountInsuranceCoverage(string);
    }

    @Когда("Нажимаем на кнопку {string}")
    public void buttonClick (String value){
        new ProductsTravelInsurancePages().buttonClick(value);
    }

    @Когда("Заполняем поля:")
    public void fillFieldForm(DataTable dataTable){
        new ProductsTravelInsurancePages().fillFields(dataTable);
    }

    @Когда("Проверяем поля:")
    public void checkFieldForm (DataTable dataTable){
        new ProductsTravelInsurancePages().checkFillFields(dataTable);
    }

    @Когда ("Проверяем наличие сообщений об ошибке у незаполненных полей: {string}")
    public void checkErrorMessageField(String dataTable){
        new ProductsTravelInsurancePages().checkControlMessage(dataTable);
    }

    @Когда ("Проверяем наличие сообщения об ошибке при заполнении данных")
    public void checkError(){
        new ProductsTravelInsurancePages().checkErrorMesage();
    }
}

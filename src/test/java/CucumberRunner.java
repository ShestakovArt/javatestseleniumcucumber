
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/"},
        glue = {"steps"},
        tags = "@testcase_1",
        plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"},
        publish = true
)
public class CucumberRunner {
}

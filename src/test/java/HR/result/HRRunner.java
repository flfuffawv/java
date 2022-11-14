package HR.result;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;


@RunWith(Cucumber.class)

@ContextConfiguration("classpath:cucumber.xml")
@CucumberOptions(


        monochrome = true,
        glue = {"HR.stepDefinitions"},

        features = "src/test/java/HR/Feature/登陆.feature",plugin = {"html:target/HR-reports/HRlogin.html","json:target/HR-reports/HRlogin.json","junit:target/HR-reports/HRlogin.xml","pretty"}

        // tags = "@委托协议输入－送样 "


)

public class HRRunner {
}

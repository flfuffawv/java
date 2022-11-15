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

       // features = "src/test/java/HR/Feature/登陆.feature",plugin = {"html:target/HR-reports/HRlogin.html","json:target/HR-reports/HRlogin.json","junit:target/HR-reports/HRlogin.xml","pretty"}
       features = "src/test/java/HR/Feature/基础资料公司.feature",plugin = {"html:target/HR-reports/HRCompany.html","json:target/HR-reports/HRCompany.json","junit:target/HR-reports/HRCompany.xml","pretty"}
        // tags = "@委托协议输入－送样 "


)

public class HRRunner {
}

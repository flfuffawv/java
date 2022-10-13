package 三亚环投.result;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;


@RunWith(Cucumber.class)

@ContextConfiguration("classpath:cucumber.xml")
@CucumberOptions(

        monochrome = false,
        glue = {"三亚环投.stepDefinitions"},

        // features = "src/test/java/三亚环投/Feature/登陆.feature",plugin = {"html:target/cucumber-reports/三亚环投.html","pretty"}
    // features = "src/test/java/三亚环投/Feature/采样任务通知单.feature",plugin = {"html:target/cucumber-reports/三亚环投.html","pretty"},
       // features = "src/test/java/三亚环投/Feature/采样记录.feature",plugin = {"html:target/cucumber-reports/三亚环投.html","pretty"}
       // features = "src/test/java/三亚环投/Feature/接样记录.feature",plugin = {"html:target/cucumber-reports/三亚环投.html","pretty"}//测试报告存放路径
       //  features = "src/test/java/三亚环投/Feature/长期委托.feature",plugin = {"html:target/cucumber-reports/三亚环投.html","pretty"},
        features = "src/test/java/三亚环投/Feature/委托协议.feature",plugin = {"json:target/cucumber/cucumber.json","html:target/cucumber-reports/三亚环投.html","pretty" },
     //   features = "src/test/java/三亚环投/Feature/原始记录.feature",plugin = {"html:target/cucumber-reports/三亚环投.html","pretty"}
        tags = "@委托协议输入－送样 "


)
public class runner {

}

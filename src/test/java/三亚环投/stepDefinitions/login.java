package 三亚环投.stepDefinitions;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.codeborne.selenide.Selenide.*;

public class login {

    @Given("SYHT-用户打开登陆页面 \"(.*)\"$")
    public void login(String b){

        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateto=sdf.format(date);
        if(b.equals("ie")){
            System.setProperty("webdriver.gecko.driver", "D:\\selenium_project\\driver\\IEDriverServer32.exe");
            Configuration.browser = "ie";
            Configuration.reportsFolder = "target/reports/limsSYHTDsgn/test"+Configuration.browser;
            Configuration.pageLoadStrategy="-Dselenide.pageLoadStrategy=eager";
            Configuration.reopenBrowserOnFail=true;
            Configuration.holdBrowserOpen = false;
            Configuration.pollingInterval=10000;
        }
        else if (b.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "D:\\selenium_project\\driver\\chromedriver.exe");
            Configuration.browser = "chrome";
            Configuration.reportsFolder = "target/reports/limsSYHTDsgn/test"+Configuration.browser;
            Configuration.reopenBrowserOnFail=true;
            Configuration.holdBrowserOpen = true;
           // Configuration.pollingInterval=10000;
            Configuration.headless=false;//运行时无窗口显示,只适合chrome59+版和firefox56+版


        }else {
            System.setProperty("webdriver.edge.driver", "D:\\selenium_project\\driver\\msedgedriver.exe");
            Configuration.browser = "edge";
            Configuration.reportsFolder = "target/reports/limsSYHTDsgn/test"+Configuration.browser;
            Configuration.reopenBrowserOnFail=true;
            Configuration.holdBrowserOpen = false;
            Configuration.pollingInterval=10000;




        }

        open("http://192.168.5.42:8105/limsSYHTDsgn/");

        sleep(2000);
    }

    @When("SYHT-用户输入用户名 \"(.*)\"$")
    public void enterUsername(String arg1) {
            sleep(2000);
        $(By.name("userName")).should(Condition.exist).sendKeys(arg1);
           // $(By.name("userName")).sendKeys(arg1);


    }

    @When("SYHT-用户输入密码 \"(.*)\"$")
    public void enterPassword(String arg2) {
       sleep(2000);
        $(By.name("password")).should(Condition.exist).sendKeys(arg2);

    }
    @When("SYHT-按登陆")
    public void login1(){

        $(By.name("d")).shouldBe(Condition.exist).sendKeys(Keys.ENTER);
    }

}




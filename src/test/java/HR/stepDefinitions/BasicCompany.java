package HR.stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class BasicCompany {
    @Given("HR-新增公司\"(.*)\"\"(.*)\"\"(.*)\"$")
    public void add_company(String cd,String name,String addr){
        switchTo().defaultContent();
        switchTo().frame($(By.xpath("//iframe[contains(@src,'basic/company/list')]")));
        sleep(1000);
        $(By.name("_id_LTaSG3256")).click();
        sleep(1000);
        $(By.name("CD")).sendKeys(cd);
        sleep(1000);
        $(By.name("NM")).sendKeys(name);

        $(By.name("ENM")).sendKeys("JT");
        $(By.name("TEL")).sendKeys("8686789");
        $(By.name("FAX")).sendKeys("8686788");
        $(By.name("ADDR")).sendKeys(addr);
        $(By.name("ATTCFM_RULE")).selectOptionContainingText("需要审核(Y");
        $(By.name("SALCFM_RULE")).selectOptionContainingText("需要审核(Y)");
        $(By.name("RATE_RULE")).selectOptionContainingText("需要转换");
        $(By.name("ALEAVE_RULE")).selectOptionContainingText("以年度为标准(2)");
        $(By.name("BILL_RULE")).selectOptionContainingText("以年度为标准(2)");
        $(By.name("CCODE")).sendKeys("20");
        $(By.name("_id_LTaSG3255")).click();
        switchTo().defaultContent();




    }
    @Given("HR-删除公司\"(.*)\"\"(.*)\"$")
    public void del_company(String c_cd,String c_nm ){
        switchTo().defaultContent();
        switchTo().frame($(By.xpath("//iframe[contains(@src,'basic/company/list')]")));
        sleep(2000);
        $(By.name("c_cd")).sendKeys(c_cd);
        $(By.name("c_nm")).sendKeys(c_nm);
        $(By.name("_id_LTaSG3260")).click();
        $(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/table/tbody/tr[2]/td[2]")).waitUntil(exist,2000).click();
        $(By.name("_id_LTaSG3423")).click();
        $(By.xpath("//button[contains(@class,'aui_state_highlight')]")).click();
        switchTo().defaultContent();
        $(By.id("ddv_hint")).should(text("删除成功"));

    }

}

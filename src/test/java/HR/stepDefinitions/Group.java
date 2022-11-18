package HR.stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Group {
    @Given("HR-新增组别\"(.*)\"\"(.*)\"$")
    public void 组别(String cd,String nm){
        switchTo().defaultContent();
        switchTo().frame($(By.xpath("//iframe[contains(@src,'basic/dept_zb/list')]")));
        $(By.name("_id_LTaSG3256")).click();
        sleep(3000);
        $(By.name("M_CD")).sendKeys(cd);
        sleep(3000);
        $(By.name("M_NM")).sendKeys(nm);
        $(By.name("ORG_VIEW")).selectOptionContainingText("外");
        $(By.name("ST")).selectOptionContainingText("停");
        $(By.name("_id_LTaSG3255")).click();


    }
    @Given("HR-查找组别\"(.*)\"\"(.*)\"$")
    public void 找组别(String cd,String nm){
        switchTo().defaultContent();
        switchTo().frame($(By.xpath("//iframe[contains(@src,'basic/dept_zb/list')]")));
        sleep(2000);
        $(By.name("c_cd")).sendKeys(cd);
        sleep(2000);
        $(By.name("c_nm")).sendKeys(nm);
        $(By.name("_id_LTaSG3260")).waitUntil(exist,2000).click();


    }
    @Given("HR-删除组别")
    public void 删组别(){
        $(By.name("M_CD")).click();
        $(By.name("_id_LTaSG3423")).click();
        $(By.xpath("//button[contains(@class,'aui_state_highlight')]")).click();
        switchTo().defaultContent();
        $(By.id("ddv_hint")).should(text("删除成功"));

    }
}

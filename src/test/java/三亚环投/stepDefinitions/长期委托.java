package 三亚环投.stepDefinitions;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class 长期委托 {
    @When("SYHT-长期委托-长期委托输入\"(.*)\"\"(.*)\"$")
    public void 新增长期委托(String cust,String type){
        switchTo().defaultContent();
        switchTo().frame(1);
        $(By.xpath("//button[contains(@class,'add_ico')]")).click();
        switchTo().defaultContent();
        switchTo().frame($(By.xpath("//iframe[contains(@src,'ccc_entrust_condition')]")));
        if(cust.equals("海南天涯水业东部供水有限公司")){
            $(By.name("cokC"),5).click();
        }else if(cust.equals("海南天涯水业西部供水有限公司")){
            $(By.name("cokC"),6).click();
        }else if(cust.equals("海南二次供水管理有限公司")){
            $(By.name("cokC"),7).click();
        }else {
            System.out.println("请重新选择客户");
        }
        if(type.equals("日检测（原水）")){
            $(By.name("cokT"),1).click();
        }else if(type.equals("日检测（出厂水）")){

            $(By.name("cokT"),2).click();
        }else if(type.equals("日检测（管网水）")){
            $(By.name("cokT"),3).click();

        }else {
            System.out.println("请重新选择类型");
        }
        $(By.xpath("//button[contains(@onclick,'choiceOK()')]")).click();


    }
    @When("SYHT-长期委托-新增样品明细\"(.*)\"$")
    public void 样品明细(String type){
        switchTo().defaultContent();
        switchTo().frame($(By.xpath("//iframe[contains(@src,'entrust_dtl.dsp')]")));
        $(By.xpath("//input[contains(@onclick,'EFF_BEGIN_DT')]")).should(Condition.exist).setValue("2022-09-16");
        $(By.xpath("//input[contains(@onclick,'EFF_END_DT')]")).should(Condition.exist).setValue("2022-09-30");
        $(By.xpath("//button[contains(@class,'edit_ico')]")).should(Condition.exist).click();

        $(By.xpath("//span[contains(@onclick,'addDetail(this)')]")).click();
        switchTo().defaultContent();
        switchTo().frame($(By.xpath("//iframe[contains(@src,'ccc_testType.dsp')]")));
        if(type.equals("日检测（原水）")){

            $(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr[4]/td[1]/input")).click();
        }else if(type.equals("日检测（管网水）")){
            $(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr[6]/td[1]/input")).click();
        }else if(type.equals("日检测（出厂水）")){
            $(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr[5]/td[1]/input")).click();
        }
        $(By.xpath("//button[contains(@onclick,'cccTT.choice()')]")).click();
        switchTo().defaultContent();
        switchTo().frame($(By.xpath("//iframe[contains(@src,'entrust_dtl.dsp')]")));
        $(By.xpath("//button[contains(@onclick,'saveDtl()')]")).click();
        $(By.xpath("//button[contains(@onclick,'goBack()')]")).click();
        sleep(5000);
        String g=$(By.xpath("/html/body/div[1]/div[1]/fieldset/table/tbody/tr[1]/td[3]/input")).should(Condition.exist).getValue();
        System.out.println("单号为:"+g);
        $(By.xpath("//button[contains(@onclick,'提交')]")).should(Condition.exist).click();
        $(By.className("aui_state_highlight")).should(Condition.exist).click();
        switchTo().defaultContent();
        switchTo().frame($(By.xpath("//iframe[contains(@src,'manChoiceByF')]")));
        $(By.xpath("//u[contains(@onclick,'choiceOK(66)')]")).click();
    }
}

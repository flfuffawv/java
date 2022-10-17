package SYHT.stepDefinitions;

import base.WebTable;
import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class 采样记录 {
    @Given("SYHT-采样记录-查找采样单\"(.*)\"$")
    public void 查找采样单(String ord){
        switchTo().defaultContent();
        switchTo().frame(1);
        sleep(2000);
                $("#id_div_list > div.hdSech1 > form > input[name='c_cd']" ).setValue(ord);
       // $(By.name("c_cd")).setValue(ord);
        sleep(2000);
        $(By.xpath("//button[contains(@onclick,'smpRecord.query')]")).should(Condition.exist).click();

       // $("#onclick").should(Condition.exist).click();
        $(By.xpath("//span[contains(@onclick,'smpRecord.edt(this)')]")).click();


    }
@Given("SYHT-采样记录-查找要处理的采样单\"(.*)\"$")
   public void 要处理的采样单(String ord){
    switchTo().defaultContent();
    switchTo().frame($(By.xpath("//iframe[contains(@_hh_ref,'indexDef')]")));
    $(By.xpath("//u[contains(text(),ord)]")).click();
}
@Given("SYHT-采样记录-输入采样记录内容")
    public void  采样记录内容(){
   switchTo().defaultContent();
    switchTo().frame($(By.xpath("//iframe[contains(@src,'sample_record_dtl')]")));
    sleep(2000);
    $(By.name("WEATER")).should(Condition.exist).setValue("晴");

    $(By.name("TEMP_AIR")).should(Condition.exist).setValue("28");

    $(By.name("TEMP_WATER")).setValue("28");
    WebTable table=new WebTable($(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td/fieldset/div/div[2]/table")));
    WebTable table2=new WebTable($(By.xpath("/html/body/div[1]/table/tbody/tr[3]/td/fieldset/div/div[2]/table")));
    int rows=table.getRowCount();
    int cells=table2.getColCount(rows);
    System.out.println(rows);
    System.out.println(cells);
    if(rows>0){
        for(int i=0;i<rows-1;i++){
            $(By.xpath("//input[contains(@name,'SMP_DT_TIME')]"),i).should(Condition.exist).setValue("0900");


        }
    }
    if(cells>1){
        for (int i=6;i<rows+5;i++){
            for(int j=2;j<cells+1;j++) {
             String state = $(By.xpath("/html/body/div[1]/table/tbody/tr[3]/td/fieldset/div/div[2]/table/tbody/tr["+i+"]/td["+j+"]/input")).getAttribute("readonly");
             System.out.println(state);
if(state==null) {
    System.out.println("元素启用");
    $(By.xpath("/html/body/div[1]/table/tbody/tr[3]/td/fieldset/div/div[2]/table/tbody/tr[" + i + "]/td[" + j + "]/input")).should(Condition.exist).setValue("2");
}

            }

        }
        $(By.id("btn_appro")).click();
    }


}
}

package 三亚环投.stepDefinitions;

import base.WebTable;
import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class 接样记录 {
    @Given("SYHT-接样记录-查找接样单\"(.*)\"$")
    public void 查找接样单(String ord){
        switchTo().defaultContent();
        switchTo().frame($(By.xpath("//iframe[contains(@src,'sample_collect')]")));
        sleep(2000);
        $(By.name("c_cd")).should(Condition.exist).setValue(ord);

        $(By.xpath("//button[contains(@onclick,'smpCollect.query()')]")).should(Condition.exist).click();

        $(By.xpath("//span[contains(@onclick,'smpCollect.edt(this)')]")).click();
        $(By.xpath("/html/body/div[1]/div[2]/div[2]/table/tbody/tr[2]/td[3]")).should(Condition.text(ord));
    }
    @When("SYHT-接样记录-输入接样单内容")
    public void 接样单(){
        switchTo().defaultContent();
        switchTo().frame($(By.xpath("//iframe[contains(@src,'sample_collect_dtl')]")));
        sleep(2000);
        WebTable table=new WebTable($(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td/fieldset/div/div[2]/table")));
        int rows=table.getRowCount();
        System.out.println(rows);

        if(rows>0){
            for(int j=2;j<rows+1;j++) {
                $(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td/fieldset/div/div[2]/table/tbody/tr[" + j + "]/td[8]/span/span[3]")).should(Condition.exist).click();
                $(By.xpath("//div[contains(text(),'陈振宇')]")).click();



            }
            if(rows>0){
                for(int i=0;i<rows-1;i++){
                    $(By.name("FACE"),i).exists();
                    $(By.name("FACE"),i).setValue("无色液体");

                }

            }
        }
       $(By.xpath("//button[contains(@onclick,'smpCollectDtl.approDtlEvent(this,2)')]")) .click();

    }
}

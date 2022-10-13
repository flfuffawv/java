package 三亚环投.stepDefinitions;

import base.WebTable;
import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class 采样任务通知 {
    @Given("SYHY-采样任务-点击新增\"(.*)\"$")
    public void 新增任务(String task){
        switchTo().defaultContent();
        switchTo().frame($(By.xpath("//iframe[contains(@src,'sample_task')]")));
        sleep(2000);
        $(By.xpath("//button[contains(@onclick,'smpTask.add(this)')]")).should(Condition.exist).click();
        if(task.equals("长期委托")) {
            $(By.xpath("//u[contains(@onclick,'6')]")).should(Condition.exist).click();
        }else if(task.equals("内部任务")){
            $(By.xpath("//u[contains(@onclick,'0')]")).should(Condition.exist).click();
            sleep(2000);
        }else if(task.equals("外部委托")){
            $(By.xpath("//u[contains(@onclick,'1')]")).should(Condition.exist).click();
        }else if(task.equals("净水剂")){
            $(By.xpath("//u[contains(@onclick,'2')]")).should(Condition.exist).click();
        }


    }
    @Given("SYHY-采样任务-内部任务\"(.*)\"\"(.*)\"$")
    public void 内部任务(String cust,String type){
        switchTo().defaultContent();
       // switchTo().frame(3);
        switchTo().frame($(By.xpath("//iframe[contains(@src,'sample/ccc_cust_smp_plc_test_typ.dsp')]")));
       // switchTo().frame($(By.xpath("//iframe[contains(@src,'ccc_cust_smp_plc_test_typ)]")));
        sleep(2000);
        if (cust.equals("海南天涯水业西部供水有限公司")) {
            $(By.xpath("/html/body/table/tbody/tr[1]/td[1]/fieldset/div[2]/div/div[2]/table/tbody/tr[7]/td[1]/input")).should(Condition.exist).click();
        }else if (cust.contains("海南天涯水业东部供水有限公司")){
            $(By.xpath("/html/body/table/tbody/tr[1]/td[1]/fieldset/div[2]/div/div[2]/table/tbody/tr[6]/td[1]/input")).should(Condition.exist).click();
        }else if(cust.contains("海南二次供水管理有限公司")){
            $(By.xpath("/html/body/table/tbody/tr[1]/td[1]/fieldset/div[2]/div/div[2]/table/tbody/tr[8]/td[1]/input")).should(Condition.exist).click();
        }else $(By.xpath("/html/body/table/tbody/tr[1]/td[1]/fieldset/div[2]/div/div[2]/table/tbody/tr[5]/td[1]/input")).should(Condition.exist).click();
        sleep(2000);
        if (type.contains("日检测（水源水）")) {
            $(By.xpath("/html/body/table/tbody/tr[1]/td[2]/fieldset/div[2]/div/div[2]/table/tbody/tr[2]/td[1]/input")).should(Condition.exist).click();
        }else if (type.contains("日检测（原水）")){
            $(By.xpath("/html/body/table/tbody/tr[1]/td[2]/fieldset/div[2]/div/div[2]/table/tbody/tr[4]/td[1]/input")).should(Condition.exist).click();

        }else if(type.contains("日检测（出厂水）")) {
            $(By.xpath("/html/body/table/tbody/tr[1]/td[2]/fieldset/div[2]/div/div[2]/table/tbody/tr[5]/td[1]/input")).should(Condition.exist).click();
        }else if(type.contains("日检测（管网水）")) {
            $(By.xpath("/html/body/table/tbody/tr[1]/td[2]/fieldset/div[2]/div/div[2]/table/tbody/tr[6]/td[1]/input")).should(Condition.exist).click();
        }else if(type.contains("月检测（水源水）")){
            $(By.xpath("/html/body/table/tbody/tr[1]/td[2]/fieldset/div[2]/div/div[2]/table/tbody/tr[7]/td[1]/input")).should(Condition.exist).click();
        }else if(type.contains("月检测（出厂水）")){
            $(By.xpath("/html/body/table/tbody/tr[1]/td[2]/fieldset/div[2]/div/div[2]/table/tbody/tr[8]/td[1]/input")).should(Condition.exist).click();
        }else if(type.contains("月检测（管网水）")){
            $(By.xpath("/html/body/table/tbody/tr[1]/td[2]/fieldset/div[2]/div/div[2]/table/tbody/tr[9]/td[1]/input")).should(Condition.exist).click();
        }else $(By.xpath("/html/body/table/tbody/tr[1]/td[2]/fieldset/div[2]/div/div[2]/table/tbody/tr[4]/td[1]/input")).should(Condition.exist).click();

        $(By.xpath("//span[contains(text(),'所有分类')]")).should(Condition.exist).click();
        $(By.xpath("//button[contains(@class,'choiceOK_ico')]")).should(Condition.exist).click();


    }
@Given("SYHY-采样任务-选择采样人\"(.*)\"$")
    public void 采样人(String person){

    switchTo().defaultContent();
    switchTo().frame($(By.xpath("//iframe[contains(@src,'sample_task_dt')]")));
    WebTable table=new WebTable($(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td/fieldset/div/div[2]/table")));
   int rows = table.getRowCount();//计算出表格的行数
    System.out.println("rows为"+rows);//打印行数

    if(rows>0) {
        for (int i = 2; i < rows+1; ++i) {
            sleep(2000);
            $(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td/fieldset/div/div[2]/table/tbody/tr["+i+"]/td[10]/span/span[3]/img")).click();

            if(person.equals("化验员1")) {
//$(By.xpath("//input[contains(text(),'化验员1')]"),1).click();
                $(By.xpath("/html/body/div[7]/div[2]/div/div[2]")).click();//化验员1

            }else if(person.equals("化验员2")){
                $(By.xpath("/html/body/div[7]/div[2]/div/div[3]")).click();


            }

        }

    }
    sleep(2000);
    $(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td/fieldset/div/div[2]/table/tbody/tr["+rows+"]/td[8]/textarea")).click();
    $(By.xpath("//span[contains(@onclick,'smpTaskDtl.delAssoc')]"),rows-2).click();
    $(By.xpath("//button[contains(@class,'aui_state_highlight')]")).click();
    $(By.xpath("//span[contains(@onclick,'smpTaskDtl.delAssoc')]"),rows-3).click();
    $(By.xpath("//button[contains(@class,'aui_state_highlight')]")).click();
    $(By.name("TEST_FINISH_DT")).setValue("2020-09-14");
    $(By.name("SMP_SRC_ID")).selectOption("采样");
    $(By.name("SMP_NOTIFT_RMK")).click();
    $(By.name("SMP_NOTIFT_RMK")).setValue("自动测试");








}
@Given("SYHY-采样任务-按保存")
public void 保存(){
    $(By.xpath("//button[contains(@onclick,'smpTaskDtl.saveDtlEvent(this)')]")).should(Condition.exist).click();

    $(By.id("ddv_hint")).shouldHave(text("保存成功"));//断言提交成功
}
@Given("SYHY-采样任务-增加采样明细")
public void 明细(){
        switchTo().defaultContent();
        switchTo().frame(2);
        $(By.id("id_spn_add")).click();
        switchTo().defaultContent();
        switchTo().frame($(By.xpath("//iframe[contains(@src,'sample/ccc_smpPlc.dsp')]")));
    $(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr[5]/td[1]/input")).click();
    $(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr[7]/td[1]/input")).click();
    $(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr[9]/td[1]")).click();
    $(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr[11]/td[1]/input")).click();
    $(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr[13]/td[1]/input")).click();
    $(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr[15]/td[1]/input")).click();
    $(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='查詢'])[1]/following::button[1]")).click();
    switchTo().defaultContent();
    switchTo().frame($(By.xpath("//iframe[contains(@src,'sample/sample_task_dtl_ccc_Test_typ')]")));
    $(By.xpath("//button[@type='button']")).waitUntil(exist,2000).click();


}
@Given("SYHY-采样任务-拉滚动条")
public void 滚动条(){
    WebTable table=new WebTable($(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td/fieldset/div/div[2]/table")));
    int row = table.getRowCount();
    //$(By.id("id_span_SMP_SCENE_NM_S"),rows-2).click();
  //  $(By.name("VOLUME_NEED"),row).click();

    $(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td/fieldset/div/div[2]/table/tbody/tr["+row+"]/td[8]/textarea")).click();
    $(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td/fieldset/div/div[2]/table/tbody/tr["+row+"]/td[8]/textarea")).sendKeys(Keys.HOME);

}

@Given("SYHY-采样任务-删除明细")
public void 删除(){
  //  switchTo().defaultContent();
  // switchTo().frame($(By.xpath("//iframe[contains(@src,'sample_task_dtl.dsp')]")));
     sleep(2000);
    $(By.xpath("//span[contains(@onclick,'smpTaskDtl.delAssoc')]"),0).click();
    $(By.xpath("//button[contains(@class,'aui_state_highlight')]")).click();
    $(By.xpath("//span[contains(@onclick,'smpTaskDtl.delAssoc')]"),1).click();
    $(By.xpath("//button[contains(@class,'aui_state_highlight')]")).click();
   // $(By.xpath("//span[contains(@onclick,'smpTaskDtl.delAssoc')]"),4).click();
   // $(By.xpath("//button[contains(@class,'aui_state_highlight')]")).click();
  //  $(By.xpath("//span[contains(@onclick,'smpTaskDtl.delAssoc')]"),5).click();
  //  $(By.xpath("//button[contains(@class,'aui_state_highlight')]")).click();
}
@Given("SYHY-采样任务-任务提交")
public void 提交(){
    switchTo().defaultContent();
    switchTo().frame($(By.xpath("//iframe[contains(@src,'sample_task')]")));
    sleep(1000);


    // $("/html/body/div[1]/div[2]/div[2]/table/tbody/tr[2]/td[1]/span[1]").should(Condition.exist).click();
    $(By.xpath("/html/body/div[1]/div[2]/div[2]/table/tbody/tr[2]/td[1]/span[1]")).should(Condition.exist).click();
    switchTo().defaultContent();
    switchTo().frame($(By.xpath("//iframe[contains(@src,'sample_task_dt')]")));
    $(By.xpath("//button[contains(@onclick,'smpTaskDtl.approDtlEvent(this)')]")).should(Condition.exist).click();
    $(By.id("ddv_hint")).should(text("提交成功"));//断言提交成功
}

@Given("SYHY-采样任务-长期委托\"(.*)\"$")
    public void 长期委托(String ord){
     switchTo().defaultContent();
     switchTo().frame($(By.xpath("//iframe[contains(@src,'ccc_entrust_task2')]")));
     $(By.name("c_cd")).should(Condition.exist).setValue(ord);
     $(By.name("_id_LTaSG3260")).should(Condition.exist).click();
     $(By.name("cok")).should(Condition.exist).click();
    $(By.xpath("//span[contains(@onclick,'所有分类')]")).should(Condition.exist).click();
    $(By.xpath("//button[contains(@onclick,'cccOk()')]")).should(Condition.exist).click();

}


}

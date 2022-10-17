package SYHT.stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class 委托协议 {
    @Given("SYHT-委托协议-新增")
    public void 新增委托协议(){
        switchTo().defaultContent();
        switchTo().frame(1);
        //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=1 | ]]
        $(By.xpath("//div[@id='id_div_list']/div/form/button[2]")).click();
    }
    @Given("SYHT-委托协议-选择送样")
    public void 送样(){
        sleep(4000);
        $(By.xpath("//*[@id=\"id_div_detail\"]/table/tbody/tr[6]/td[3]/span/label[2]/input")).click();
        System.out.println("点击送样");
    }
@Given("SYHT-委托协议-输入\"(.*)\"\"(.*)\"$")
    public void 委托协议(String cust,String typ) {

 switchTo().defaultContent();
 switchTo().frame(3);
        //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
        //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=3 | ]]
if(cust.equals("海南天涯水业东部供水有限公司")) {
    $(By.xpath("//input[contains(@onclick,'ccc(this)')]"), 4).click();
}else if(cust.equals("海南天涯水业西部供水有限公司")){
    $(By.xpath("//input[contains(@onclick,'ccc(this)')]"), 5).click();
}else if(cust.equals("海南二次供水管理有限公司")){
    $(By.xpath("//input[contains(@onclick,'ccc(this)')]"), 6).click();
}
        switchTo().defaultContent();
        switchTo().frame(2);
        //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
        //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=2 | ]]
        $(By.id("id_spn_bat_add")).click();
        switchTo().defaultContent();
        switchTo().frame(3);
        //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
        //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=3 | ]]
    if(typ.equals("日检测（出厂水）")) {
        $(By.xpath("//input[contains(@onclick,'cccTT.ccc(this)')]"), 3).click();
    }else if(typ.equals("日检测（原水）")){
        $(By.xpath("//input[contains(@onclick,'cccTT.ccc(this)')]"), 2).click();
    }
        switchTo().defaultContent();
        switchTo().frame(2);
        //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
        //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=2 | ]]
        $(By.name("B_CUST_CONTACT")).click();
        $(By.name("B_CUST_CONTACT")).clear();
        $(By.name("B_CUST_CONTACT")).sendKeys("张");
        $(By.name("B_CUST_TEL")).click();
        $(By.name("B_CUST_TEL")).clear();
        $(By.name("B_CUST_TEL")).sendKeys("157897171");
        $(By.name("NM")).click();
        $(By.name("NM")).clear();
        $(By.name("NM")).sendKeys("海南天涯2022");
        $(By.name("USE_FOR")).click();
        $(By.name("USE_FOR")).clear();
        $(By.name("USE_FOR")).sendKeys("检测");
        $(By.name("PRICE_TEST")).click();
        $(By.name("PRICE_TEST")).clear();
        $(By.name("PRICE_TEST")).sendKeys("159.2");
        $(By.name("PRICE_SMP")).click();
        $(By.name("PRICE_SMP")).clear();
        $(By.name("PRICE_SMP")).sendKeys("14.9");
        $(By.name("PRICE_MATE")).click();
        $(By.name("PRICE_MATE")).clear();
        $(By.name("PRICE_MATE")).sendKeys("16.4");
        $(By.name("ENTRUST_NM")).click();
        $(By.name("ENTRUST_NM")).clear();
        $(By.name("ENTRUST_NM")).sendKeys("张");
        $(By.name("TEST_NM")).click();
        $(By.name("TEST_NM")).clear();
        $(By.name("TEST_NM")).sendKeys("李");
        $(By.name("FINISH_DT")).click();
      //  switchTo().defaultContent();
      //  switchTo().frame(3);
        //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
     //   //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=3 | ]]
     //   $(By.xpath("//td[@onclick='day_Click(2022,9,22);']")).click();
     //   switchTo().defaultContent();
      //  switchTo().frame(2);
        //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
        //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=2 | ]]
        $(By.name("FINISH_DT")).sendKeys("2022-09-22");
        $(By.name("ENTRUST_DT")).sendKeys("2022-07-22");
        $(By.name("TEST_DT")).sendKeys("2022-07-22");
        $(By.xpath("//div[@id='id_div_detail']/table/tbody/tr[11]/td[2]")).click();

    }

@Given("SYHT-委托协议-保存")
    public void 保存委托协议(){
    $(By.id("id_btn_save")).click();
    sleep(1000);
    switchTo().defaultContent();
    $(By.id("ddv_hint")).should(text(" 保存成功！"));
}


}

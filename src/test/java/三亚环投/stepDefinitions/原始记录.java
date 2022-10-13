package 三亚环投.stepDefinitions;

import base.WebTable;
import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class 原始记录 {
@Given("输入原始记录")
public void 检测任务接收单(){

    switchTo().defaultContent();
    switchTo().frame(0);

    //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=0 | ]]
    $(By.xpath("//u[contains(text(),'ORT2022041504')]")).click();
  //  $(By.xpath("//div[@id='id_div_workList']/div[2]/ol/li[50]/u")).click();
    switchTo().defaultContent();
    switchTo().frame(1);
    //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=1 | ]]
    $(By.name("Abox")).click();
    $(By.name("cok"),3).click();
    $(By.id("id_btn_submit")).click();
    $(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='确认接受任务吗？接受后将产生相应的原始记录表！'])[1]/following::button[1]")).click();
  String n=$(By.xpath("//u[contains(@onclick,'oriTest.edt(this)')]"),0).getText();
  System.out.println(n);
    String name=$(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr[2]/td[2]")).getText();
    System.out.println(name);
   // $(By.xpath("//div[@id='X2d600bbe60ce4ca045b13449']/div[2]/table/tbody/tr[2]/td[2]")).click();
  //  $(By.xpath("//div[@id='X2d600bbe60ce4ca045b13449']/div[2]/table/tbody/tr[2]/td")).click();
    $(By.xpath("//u[contains(text(),'"+n+"')]")).click();
   // $(By.xpath("//u[@onclick='oriTest.edt(this)']")).click();
    //$(By.id("sheet1_A3")).click();
    WebTable table=new WebTable($(By.xpath("/html/body/div[1]/div[1]/div/table")));
    int h=table.getRowCount();
    int s=table.getColCount(h);
    System.out.println(h);
    System.out.println(s);
    if(name.equals("浑浊度")) {
        $(By.id("1C3B8F20144328B8")).click();
        $(By.id("1C3B8F20144328B8")).clear();
        $(By.id("1C3B8F20144328B8")).sendKeys("0.25");
        $(By.id("1C3B8F20144328B8")).sendKeys(Keys.DOWN);
        $(By.id("1C3B8F20144328B8")).clear();
        $(By.id("1C3B8F20144328B8")).sendKeys("0.25");
        $(By.xpath("//table[@id='sheet1']/tbody/tr[13]/td[5]/input")).sendKeys(Keys.DOWN);
        $(By.xpath("//table[@id='sheet1']/tbody/tr[13]/td[5]/input")).clear();
        $(By.xpath("//table[@id='sheet1']/tbody/tr[13]/td[5]/input")).sendKeys("0.36");
        $(By.xpath("//table[@id='sheet1']/tbody/tr[14]/td[5]/input")).sendKeys(Keys.DOWN);
        $(By.xpath("//table[@id='sheet1']/tbody/tr[14]/td[5]/input")).clear();
        $(By.xpath("//table[@id='sheet1']/tbody/tr[14]/td[5]/input")).sendKeys("0.25");
        $(By.xpath("//table[@id='sheet1']/tbody/tr[15]/td[5]/input")).sendKeys(Keys.DOWN);
        $(By.xpath("//table[@id='sheet1']/tbody/tr[15]/td[5]/input")).clear();
        $(By.xpath("//table[@id='sheet1']/tbody/tr[15]/td[5]/input")).sendKeys("0.34");
        $(By.xpath("//table[@id='sheet1']/tbody/tr[16]/td[5]/input")).sendKeys(Keys.DOWN);
        $(By.xpath("//table[@id='sheet1']/tbody/tr[16]/td[5]/input")).clear();
        $(By.xpath("//table[@id='sheet1']/tbody/tr[16]/td[5]/input")).sendKeys("0.31");
        $(By.xpath("//table[@id='sheet1']/tbody/tr[17]/td[5]/input")).clear();
        $(By.xpath("//table[@id='sheet1']/tbody/tr[17]/td[5]/input")).sendKeys("0.3");
    } else if(name.equals("耗氧量（以O2 计）")){

        if(h>3){
            for(int i=3;i<h;i++){
                $(By.xpath("/html/body/div[1]/div[1]/div/table/tbody/tr["+i+"]/td[5]/input")).setValue("100");

            }
        }

    }
    $(By.id("id_btn_save")).click();
   // $(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='不能为空'])[1]/following::button[1]")).click();
    $(By.id("D8DD209479E63678")).click();
    $(By.id("D8DD209479E63678")).clear();
    $(By.id("D8DD209479E63678")).sendKeys("26");
    $(By.id("D8DD209479E63678")).sendKeys(Keys.ENTER);
    $(By.id("CB6A2138F5E7A124")).clear();
    $(By.id("CB6A2138F5E7A124")).sendKeys("78");
    $(By.id("id_btn_save")).click();
}
@Given("原始记录\"(.*)\"$")
public void 原始记录(String ord) {

    switchTo().defaultContent();
    switchTo().frame(0);
    String n = $(By.xpath("//u[contains(text(),'"+ord+"')]")).waitUntil(Condition.exist, 2000).getText();
    System.out.println(n);
    $(By.xpath("//u[contains(text(),'"+ord+"')]")).click();
    switchTo().defaultContent();
    switchTo().frame(1);
    WebTable table = new WebTable($(By.id("sheet1")));
    int h = table.getRowCount();
    //int s=table.getColCount(h);
    System.out.println(h);
    // System.out.println(s);
    $(By.name("HJWD")).setValue("25");
    $(By.name("HJSD")).setValue("78");
    if (n.contains("色度")) {
        for (int i = 12; i < h - 2; i++) {
            if (i == 12) {

                $(By.xpath("/html/body/div[1]/div[1]/div/table/tbody/tr[" + i + "]/td[5]/input")).setValue("100");
                $(By.xpath("/html/body/div[1]/div[1]/div/table/tbody/tr[" + i + "]/td[6]/input")).setValue("0");
                $(By.xpath("/html/body/div[1]/div[1]/div/table/tbody/tr[" + i + "]/td[7]/input")).setValue("2.25");


            } else {

                $(By.xpath("/html/body/div[1]/div[1]/div/table/tbody/tr[" + i + "]/td[5]/input")).setValue("100");
                $(By.xpath("/html/body/div[1]/div[1]/div/table/tbody/tr[" + i + "]/td[6]/input")).setValue("0");
                $(By.xpath("/html/body/div[1]/div[1]/div/table/tbody/tr[" + i + "]/td[7]/input")).setValue("1.25");


            }


        }


    } else if (n.contains("肉眼可见物")) {
        for (int i = 8; i < h; i++) {
            if (i == 8) {

                $(By.xpath("/html/body/div[1]/div[1]/div/table/tbody/tr[" + i + "]/td[5]/input")).setValue("0");
                $(By.xpath("/html/body/div[1]/div[1]/div/table/tbody/tr[" + i + "]/td[6]/input")).setValue("无");


            } else {

                $(By.xpath("/html/body/div[1]/div[1]/div/table/tbody/tr[" + i + "]/td[5]/input")).setValue("0");
                $(By.xpath("/html/body/div[1]/div[1]/div/table/tbody/tr[" + i + "]/td[6]/input")).setValue("未检出");


            }

        }
    }else if(n.contains("浑浊度")){
        for (int i = 12; i < h ; i++) {
            if (i == 12) {

                $(By.xpath("/html/body/div[1]/div[1]/div/table/tbody/tr[" + i + "]/td[5]/input")).setValue("0.25");




            } else {

                $(By.xpath("/html/body/div[1]/div[1]/div/table/tbody/tr[" + i + "]/td[5]/input")).setValue("0.15");




            }


        }


    }
    if($(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='×'])[1]/following::button[1]")).exists()){
    $(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='×'])[1]/following::button[1]")).click();}
}


}

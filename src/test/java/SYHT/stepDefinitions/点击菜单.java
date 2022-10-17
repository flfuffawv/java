package SYHT.stepDefinitions;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class 点击菜单 {
    @Given("SYHT-点击检测管理")
    public void 检测管理(){
       Selenide.sleep(2000);

        $(By.xpath("//label[contains(text(),'检测管理')]")).click();

       // $(By.xpath("//label[contains(@name,'idMlg45824')]")).click();
    }
    @Given("SYHT-点击采样任务通知单")
    public void 采样任务通知单(){
        $(By.xpath("//div[@id='_id_menu_2']/div[11]/label")).click();

    }
    @Given("SYHT-点击采样记录")
    public void 采样记录(){
        $(By.xpath("//*[@id=\"_id_menu_2\"]/div[11]")).click();

    }
    @Given("SYHT-点击接样记录")
    public void 接样记录(){
        $(By.xpath("//*[@id=\"_id_menu_2\"]/div[14]")).click();
    }
    @Given("SYHT-点击长期委托")
    public void 长期委托(){
        $(By.xpath("//*[@id=\"_id_menu_2\"]/div[2]")).click();

    }
    @Given("SYHT-点击委托协议")
    public void 委托协议(){
        $(By.xpath("//div[@id='_id_menu_2']/div[5]/label")).click();

    }
}

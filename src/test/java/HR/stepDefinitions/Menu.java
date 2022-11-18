package HR.stepDefinitions;
import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Menu {
    @Given("HR-点击基本资料")
    public void 基本资料(){
sleep(3000);
        $(By.xpath("//label[@name='_idMlg72448']")).waitUntil(Condition.exist,3000).click();
    }
    @Given("HR-点击公司")
    public void 公司(){
        $(By.xpath("//div[@id='_id_menu_2']/div/label")).waitUntil(Condition.exist,3000).click();
    }
    @Given("HR-点击考勤管理")
    public void 考勤管理(){
        $(By.name("_idMlg72704")).waitUntil(Condition.exist,3000).click();
    }
    @Given("HR-点击组别")
    public void 组别(){
        $(By.xpath("//div[@id='_id_menu_2']/div[2]/label")).waitUntil(Condition.exist,3000).click();

    }
    @Given("HR-用例备注\"(.*)\"$")
    public void 用例备注(String remark){
        String str = remark;
    }
}

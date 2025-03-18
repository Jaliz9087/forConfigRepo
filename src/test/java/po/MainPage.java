package po;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;



public class MainPage {
    public SelenideElement header = $("#rec773533774");
    @Step("Открываем главную страницу")
    public MainPage
    openPage() {
        open("https://qa.guru/");
        return this;
    }
    @Step("Чекаем хэдер")
    public MainPage head(){
        header.shouldHave(text("Школа инженеров"));
        return this;
    }


}

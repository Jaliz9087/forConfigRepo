import org.junit.jupiter.api.Test;
import po.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class SimpleTest {
    MainPage page = new MainPage();
    @Test
    void openWbMainPageAndCheckHeader(){
        page.openPage();
        page.head();


    }
}

import com.codeborne.selenide.Selenide;
import config.DConf;
import config.WDConf;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    private static final DConf configData =
            ConfigFactory.create(
                    DConf.class,
                    System.getProperties()
            );
    @BeforeAll
    public static void beforeAll(){
        WDConf webDriverConfig = new WDConf(configData);
        webDriverConfig.dataConfig();

    }
    @AfterEach
    public void afterEach(){
        Selenide.closeWebDriver();
    }
}
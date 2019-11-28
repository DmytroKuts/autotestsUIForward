import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class MainTestsClass {
    @Test
    void test1() {
        open("http://10.10.17.156/auth");
    }
}

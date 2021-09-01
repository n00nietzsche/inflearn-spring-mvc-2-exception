package hello.exception;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.web.servlet.server.Encoding;

public class LearningTest {

    @Test
    @DisplayName("UTF-8 문자열 어디서 제공하는지 알아보려고 학습 테스트")
    public void encodingName() {
        String name = Encoding.DEFAULT_CHARSET.name();
        System.out.println("name = " + name);
    }
}

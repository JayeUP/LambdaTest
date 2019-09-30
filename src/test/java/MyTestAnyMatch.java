import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MyTestAnyMatch {

    @Test
    public void myTest() {
        List<String> list = Arrays.asList("true", "false");
        boolean isMatch = list.stream().map(Boolean::parseBoolean).anyMatch(Predicate.isEqual(true));
        System.out.println("是否匹配：" + isMatch);
    }

}

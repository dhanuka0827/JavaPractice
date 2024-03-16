package module1.java8;

import java.util.List;
import java.util.Optional;

public class TestOptional {

    public static void main(String[] args) {
        List<String> str = null;
        Optional<List<String>> stringOptional = Optional.ofNullable(str);

        System.out.println(stringOptional.isEmpty());
    }

}

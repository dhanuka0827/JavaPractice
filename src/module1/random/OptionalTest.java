package module1.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        List<?> dataList = new ArrayList<>();
        Optional<List<?>> checkNull = Optional.ofNullable(dataList);

        System.out.println(dataList.size());
        System.out.println(checkNull.isEmpty());
        System.out.println(checkNull.isPresent());
        if (checkNull.isPresent()) {
            System.out.println(dataList.size());
        } else {
            System.out.println("list is empty");
        }
        System.out.println(Optional.empty().isEmpty());
    }
}

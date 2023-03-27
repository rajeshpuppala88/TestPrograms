package L1Test;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateStrings {
    public static void main(String[] args) {
        List<String> stream2 = Arrays.asList("fff","fff","asdfadsf");
        stream2.stream().distinct().forEach(System.out::println);
    }
}

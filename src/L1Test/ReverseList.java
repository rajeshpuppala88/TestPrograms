package L1Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseList {
    public static void main(String[] args) {
        List<String> listArr = Arrays.asList("abc","xyz","pqr","lmn");
        listArr = listArr.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(listArr);
        reverseList();
    }
    public static void reverseList(){
        Stream<?> s = Stream.of(1, 2, 3, 4, 5);

        List<?> list = s.collect(
                Collectors.collectingAndThen(
                        Collectors.toList(),
                        l -> {
                            Collections.reverse(l); return l; }
                )
        );

        System.out.println(list);
    }
}

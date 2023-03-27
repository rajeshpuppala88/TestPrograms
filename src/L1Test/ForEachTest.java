package L1Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ForEachTest {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(20,20,30,1,0,44);
        integerList.stream().filter(i-> i>10).forEach(System.out::println);
        System.out.println("map");
        integerList.stream().map(i-> i>10).forEach(System.out::println);
    }
}

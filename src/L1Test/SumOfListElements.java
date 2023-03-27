package L1Test;

import java.util.Arrays;
import java.util.List;

public class SumOfListElements {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10,20,50,70);
        int sum = integerList.stream().mapToInt(i -> i).sum();
        System.out.println(sum);
    }
}

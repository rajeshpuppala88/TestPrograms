package L1Test;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class SquareOfListElements {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(20,20,30);
        OptionalDouble square = integerList.stream().mapToInt(i -> i*i).filter(j->j>100).average();
        System.out.println(square.getAsDouble());
    }
}

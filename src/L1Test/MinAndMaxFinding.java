package L1Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class MinAndMaxFinding {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(20,20,30,1,0,44);
        System.out.println("min number "+integerList.stream().sorted().findFirst().get());
        System.out.println("Max number "+integerList.stream().sorted().skip(integerList.size()-1).findFirst().get());
        System.out.println("Max number test 2 :"+integerList.stream().sorted(Comparator.reverseOrder()).findFirst().get());
    }
}

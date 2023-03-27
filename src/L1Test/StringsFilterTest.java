package L1Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StringsFilterTest {
    public static void main(String[] args) {

        List<String> StringList = Arrays.asList("Rajesh","Nadeem","venky","kishore","Ram");

        Predicate<String> predicate = s->s.length()>5;
        System.out.println("count :"+StringList.stream().filter(s->s.length()>5).count());
        StringList.stream().filter(s->s.length()>5).forEach(System.out::println);
        System.out.println("predicate output");
        StringList.stream().filter(predicate).forEach(System.out::println);


    }
}

package L1Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatStreams {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Rajesh","Nadeem","Test");
        List<String> list2 = Arrays.asList("asdfasdf","asfdasd","asdfadsf");
        Stream.concat(list1.stream(),list2.stream()).forEach(System.out::println);
        Stream.concat(list1.stream(),list2.stream()).filter(s->s.startsWith("as")).forEach(System.out::println);
    }
}

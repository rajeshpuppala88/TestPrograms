package L1Test;

import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add("rajesh");
        stringJoiner.add("nadeem");
        stringJoiner.add("kishore");
        stringJoiner.add("prakash");
        System.out.println(stringJoiner);

        StringJoiner stringJoinerDelim = new StringJoiner(",","(",")");
        stringJoinerDelim.add("rajesh");
        stringJoinerDelim.add("nadeem");
        stringJoinerDelim.add("kishore");
        stringJoinerDelim.add("prakash");
        System.out.println(stringJoinerDelim);
    }
}

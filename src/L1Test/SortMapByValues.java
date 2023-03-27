package L1Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class SortMapByValues {
    public static void main(String[] args) {

        Map<String,Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("xyz",11);
        unsortedMap.put("abc",2);
        unsortedMap.put("lmn",38);
        unsortedMap.put("pqr",4);
        unsortedMap.put("def",50);
        for(Map.Entry<String,Integer> entryMap:unsortedMap.entrySet()){
            System.out.println(entryMap.getKey()+" , "+entryMap.getValue());
        }

        Map<String, Integer> result2 = new LinkedHashMap<>();
        Map<String, Integer> result3 = new LinkedHashMap<>();
       /* unsortedMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));*/

        unsortedMap.entrySet().stream().
                sorted(Map.Entry.<String,Integer>comparingByValue().reversed()).
                forEachOrdered(x -> result2.put(x.getKey(),x.getValue()));

        System.out.println("result2 :"+result2);

        unsortedMap.entrySet().stream().
                sorted(Map.Entry.<String,Integer>comparingByKey().reversed()).
                forEachOrdered(x -> result3.put(x.getKey(),x.getValue()));

        System.out.println("result3 :"+result3);


        System.out.println("unsorted map :"+unsortedMap);
        Map<String, Integer> sortedByValuesMap =
                unsortedMap.entrySet().stream().
                sorted(comparingByValue()).
                collect(toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2) -> e2,LinkedHashMap::new));
        System.out.println("sorted by values :"+sortedByValuesMap);


        Map<String, Integer> sortedByKeysMap =
                unsortedMap.entrySet().stream().
                        sorted(comparingByKey()).
                        collect(toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2) -> e1,LinkedHashMap::new));
        System.out.println("sorted by keys :"+sortedByKeysMap);
    }
}

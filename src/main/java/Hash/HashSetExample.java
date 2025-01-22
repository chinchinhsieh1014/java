package Hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // add
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");

        // contains
        System.out.println("Contains 'Banana': " + set.contains("Banana"));

        // remove
        set.remove("Cherry");

        // for
        for (String fruit : set) {
            System.out.println("Fruit: " + fruit);
        }

    }

    public static boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char c: s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        HashSet<Integer> frequencies = new HashSet<>(counts.values());
        return frequencies.size() == 1;
    }
}

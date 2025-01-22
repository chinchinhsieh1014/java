package Array_String;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // Declare
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> arrayListWithSize = new ArrayList<>(10);

        // add()
        numbers.add(0, 1);
        numbers.add(13);
        numbers.add(124);
        numbers.add(32);
        numbers.add(0, 5);
        for(int num : numbers){
            System.out.println(num);
        }

        // get(index)
        int get0 = numbers.get(0);

        // indexOf(val)
        // return the first occurrence of the value
        System.out.println(numbers.indexOf(13));
        System.out.println(numbers.indexOf(130));

        // set(index, newValue)
        numbers.set(0,0);

        // remove
        // can be index or value
        numbers.remove(0);

        // size()
        int size = numbers.size();

        // for
        for(int i=0; i<numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        for(int num : numbers){
            System.out.println(num);
        }
        numbers.forEach(item -> System.out.println(item+10));

        // contains()
        boolean hasOne = numbers.contains(1);

        // Collections.sort()
        Collections.sort(numbers);
        System.out.println(numbers);

        // clear()
        numbers.clear();

        // isEmpty()
        System.out.println(numbers.isEmpty());

        // Remove duplicate item
        ArrayList<Integer> listWithDuplicates = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4));
        Set<Integer> set = new HashSet<>(listWithDuplicates);
        listWithDuplicates.clear();
        listWithDuplicates.addAll(set);
        System.out.println(listWithDuplicates);

    }
}

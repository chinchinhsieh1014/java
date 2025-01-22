package Basic.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        // Ascending order
        Comparator<Integer> comparator = (a, b) -> a - b;

        // Descending order
        Comparator<Integer> reverseComparator = (a, b) -> b - a;

        // Compare by string length
        Comparator<String> comparator_str = Comparator.comparing(String::length);

        // Reverse order
        Comparator<String> reverseComparator_str = Comparator.comparing(String::length).reversed();

        // example 1
        List<Integer> nums = Arrays.asList(5, 2, 8, 3, 1);
        nums.sort((a, b) -> a - b);
        System.out.println(nums);

        // example 2
        List<Person> people = Arrays.asList(new Person("Alice", 30),
                                            new Person("Bob", 25),
                                            new Person("Box", 25),
                                            new Person("Claire", 12));
        people.sort((a, b) -> b.age-a.age);
        people.forEach((p) -> { System.out.println(p.name + ": " + p.age);});

        // example 3
        // sort by age and then name alphabetically:
        people.sort(Comparator.comparingInt((Person p)-> p.age).thenComparing((Person p) -> p.name));
        people.forEach((p) -> { System.out.println(p.name + ": " + p.age);});
    }
}

package Array_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExample {
    public static void main(String[] args) {
        // Declaration
        int[] number1;

        // Initialise
        int[] number2 = new int[5];
        String[] fruits = {"Apple", "Banana", "Cherry"};
        int[] number3 = new int[] {10, 20, 30, 40, 50};

        // length
        int len = number2.length;

        // for
        for(int i=0; i<number3.length; i++) {
            System.out.println("Element at index " + i + ": " + number3[i]);
        }
        for(int num: number3) {
            System.out.println(num);
        }

        // asList()
        // covert an array to ArrayList
        Integer[] array1 = {(Integer)1, (Integer) 2, (Integer)3, (Integer)4, (Integer)5};
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(array1));
        System.out.println(arrayList1.getClass().getName());

        // toArray()
        // covernt an ArrayList to array
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] array2 = new Integer[arrayList2.size()];
        arrayList2.toArray(array2);
        System.out.println(array2.getClass().getName());


        // 2D
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // java.util.Arrays
        // toString()
        System.out.println(Arrays.toString(number3));
        // deepToString()
        System.out.println(Arrays.deepToString(matrix));
        // equals()
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3};
        System.out.println(Arrays.equals(arr1, arr2));
        // sort()
        Integer[] numbers = {5, 3, 8, 1, 2};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        // + lambda function
        Arrays.sort(numbers, (a, b) -> Integer.compare(b, a));
        System.out.println(Arrays.toString(numbers));
        // copyOf()
        int[] copyArr1AddTo10 = Arrays.copyOf(arr1, 10);
        System.out.println(Arrays.toString(copyArr1AddTo10));
        // copyOfRange()
        int[] arr1To4 = Arrays.copyOfRange(copyArr1AddTo10, 1, 4);
        System.out.println(Arrays.toString(arr1To4));
        // fill()
        int[] zero  = new int[5];
        Arrays.fill(zero, 0);
        System.out.println(Arrays.toString(zero));
        // binarySearch()
        int[] search = {1, 2, 3, 4, 5};
        int found_index = Arrays.binarySearch(search, 3);
        System.out.println(found_index);
        int not_found_index = Arrays.binarySearch(search, 100);
        System.out.println(not_found_index);
        // stream()
        // covert an array to a stream
        int[] arr_stream = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(arr_stream).sum();
        System.out.println(sum);
        // asList()
        String[] words = {"apple", "banana", "cherry"};
        List<String> list = Arrays.asList(words);
        System.out.println(list);
        // parallelSort()
        int[] parallelSortArr = {5, 3, 8, 1, 2};
        Arrays.parallelSort(parallelSortArr);
        System.out.println(Arrays.toString(parallelSortArr));
    }

    // Passing an Array to a Method
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    // Returning an Array from a Method
    public static int[] createArray() {
        return new int[] {10, 20, 30, 40, 50};
    }
}

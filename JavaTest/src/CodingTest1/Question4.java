package CodingTest1;

import java.lang.reflect.Array;
import java.util.LinkedHashSet;

public class Question4 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 3, 2, 5, 6, 7, 6};
        int[] result = removeDuplicates(arr);

        System.out.print("Array without Duplicates: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static int[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

}

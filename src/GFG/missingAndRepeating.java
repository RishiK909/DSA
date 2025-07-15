package GFG;

import java.util.ArrayList;
import java.util.HashSet;

public class missingAndRepeating {
    public static void main(String[] args) {

        int[] arr = {4, 3, 6, 2, 1, 1};
        System.out.println(findTwoElement(arr));

    }

    public static ArrayList<Integer> findTwoElement(int arr[]) {

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> lst = new ArrayList<>();

        int repeating = -1;

        for (int a : arr) {
            if (set.contains(a)) {
                repeating = a;
            } else {
                set.add(a);
            }
        }

        int missing = -1;

        for (int i = 0; i <= arr.length; i++) {
            if (!set.contains(i)) {
                missing = i;
            }
        }

        lst.add(repeating);
        lst.add(missing);

        return lst;


    }
}

package LeetCode;

/**
 * To solve this que solve first 503
 */
public class LeetCode907 {

    public static void main(String[] args) {

        LeetCode907 leetCode907 = new LeetCode907();
        System.out.println(leetCode907.sumSubarrayMins(new int[]{3,1,2,4}));
    }

    public int sumSubarrayMins(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            int min = Integer.MAX_VALUE;

            for (int j = i; j < arr.length; j++) {

                min = Math.min(min, arr[j]);

                sum += min;
            }
        }

        return sum;

    }
}

package GFG;

public class LeftSmallerRightGreater {

    public static void main(String[] args)
    {

        LeftSmallerRightGreater lsr = new LeftSmallerRightGreater();
        int[] arr = {4,2,5,7};
        System.out.println(lsr.findElement(arr));

    }

    public int findElement(int[] arr) {

            int n = arr.length;

            int[] leftMax = new int[n];
            int[] rightMin = new int[n];

            leftMax[0] = Integer.MIN_VALUE;

            for (int i = 1; i < n; i++) {
                leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);
            }

            rightMin[n - 1] = Integer.MAX_VALUE;

            for (int i = n - 2; i >= 0; i--) {
                rightMin[i] = Math.min(rightMin[i + 1], arr[i + 1]);
            }

            for (int i = 0; i < n; i++) {
                if (leftMax[i] < arr[i] && arr[i] < rightMin[i]) {
                    return arr[i];
                }
            }

            return -1;
        }
}

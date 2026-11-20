package GFG;

public class RoofTop
{
    public static void main(String[] args)
    {
        RoofTop roofTop = new RoofTop();
        int[] arr = {1, 2, 2, 3, 2};
        System.out.println(roofTop.maxStep(arr));
    }

    public int maxStep(int[] arr)
    {
        // code here

        int count = 0;
        int maxCount = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else {
                count = 0;
            }
        }

        return maxCount;
    }
}

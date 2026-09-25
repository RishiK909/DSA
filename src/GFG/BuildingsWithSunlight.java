package GFG;

public class BuildingsWithSunlight
{
    public static void main(String[] args)
    {

        BuildingsWithSunlight obj = new BuildingsWithSunlight();
        int[] arr = {27550,1833,18375,1438,24757,5770};
        System.out.println(obj.visibleBuildings(arr));
    }

    public int visibleBuildings(int[] arr) {
        // code here

        int count = 0;
        int max = Integer.MIN_VALUE;

        for(int i= 0; i < arr.length; i++)
        {
            if(max <= arr[i]) {
                max = arr[i];
                count++;
            }
        }

        return count;

    }
}

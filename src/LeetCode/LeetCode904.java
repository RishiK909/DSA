package LeetCode;

import java.util.HashSet;

public class LeetCode904
{

    static void main()
    {
        LeetCode904 l = new LeetCode904();
        int[] arr = {1,2,1,2,3,2};
        System.out.println(l.totalFruit(arr));
    }

    public int totalFruit(int[] fruits)
    {
        int windowSize = 2;
        HashSet<Integer> set = new HashSet<>();
//        set.add(fruits[0]);

        for(int i = 0; i < fruits.length; i++)
        {
            if(!set.contains(fruits[i]))
            {
                set.add(fruits[i]);
                windowSize--;
            }
        }
    }

}

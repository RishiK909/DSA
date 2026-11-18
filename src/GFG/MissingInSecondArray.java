package GFG;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MissingInSecondArray {

    public static void main(String[] args) {

        MissingInSecondArray missingInSecondArray = new MissingInSecondArray();
        int[] a = {1,2,3,4,5,10};
        int[] b = {2,3,1,0,5};
        System.out.println(missingInSecondArray.findMissing(a,b));
    }
    ArrayList<Integer> findMissing(int[] a, int[] b) {
        // code here

        ArrayList<Integer> list = new ArrayList<>();
        /*HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for(int aa : a)
        {
            map1.put(aa,map1.getOrDefault(aa,0)+1);
        }

        for(int bb : b)
        {
            map2.put(bb,map2.getOrDefault(bb,0)+1);
        }

        for(int key : map1.keySet())
        {
            if(!map2.containsKey(key))
            {
                list.add(key);
            }
        }*/

        HashSet<Integer> set = new HashSet<>();

        for(int num : b)
        {
            set.add(num);
        }


        for(int num : a)
        {
            if(!set.contains(num))
            {
                list.add(num);
            }
        }

        return list;

    }
}

package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode3839
{

    public int prefixConnected(String[] words, int k)
    {

        // Failed testCase "bat","dog","dog","doggy","bat"
        // coz of dog count increments 3 times but actually output is 2
        //Approach 1

        /*StringBuilder sb = new StringBuilder();
        HashSet<String> set = new HashSet<>();
        int count = 0;

        for(String word : words)
        {
            if(word.length() < k)
            {
                continue;
            }

            sb.setLength(0);
            StringBuilder builder = sb.append(word, 0, k);
//            set.add(builder.toString());

            if(set.contains(builder.toString()))
            {
                 count++;
            }

            set.add(builder.toString());
        }

        return count;*/

        //Approach 2

        HashMap<String,Integer> map = new HashMap<>();
        int count = 0;

        for(String word : words)
        {
            if(word.length() < k)
            {
                continue;
            }

            String prefix = word.substring(0, k);
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);

        }

        for(int value : map.values())
        {
            if(value >= 2 )
            {
                count++;
            }
        }

        return count;


        //Approach 3
        //Not Completed kindly comment this before compiling

        /*HashSet<Integer> setInt = new HashSet<>();
        HashSet<String> set = new HashSet<>();
        int count = 0;

        for(String word : words)
        {
            if(word.length() < k)
            {
                continue;
            }


            String s = word.substring(0, k);
            set.add(s);
            setInt.add();

            if(set.contains(builder.toString()))
            {
                count++;
            }

            set.add(builder.toString());
        }

        return count;*/

    }

    static void main()
    {
        LeetCode3839 leetcode = new LeetCode3839();
        System.out.println(leetcode.prefixConnected(new String[]{"bat","dog","dog","doggy","bat"}, 3));
    }
}
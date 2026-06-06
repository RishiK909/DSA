package LeetCode;

import java.util.Arrays;

public class LeetCode3760 {
    public int maxDistinct(String s) {

        //Approach 1
        // Java Collections

        /*HashSet<Character> set = new HashSet<>();

        for(int i=0; i<s.length(); i++)
        {
            set.add(s.charAt(i));
        }

        return set.size();*/


        // Approach 2

        // Without java collections

        Character[] arr = new Character[26];

        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'a'] = s.charAt(i);
        }
        int count =0;

        for(int i = 0; i < 26; i++){
             if(arr[i] != null){
                 count++;
             }
        }

        return count;


    }

    public static void main(String[] args) {

        LeetCode3760 leetcode3760 = new LeetCode3760();
        System.out.println(leetcode3760.maxDistinct("aaaa"));
    }
}

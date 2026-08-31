package LeetCode;

import java.util.HashSet;

public class LeetCode1763 {

    static void main() {

        LeetCode1763 leetCode1763 = new LeetCode1763();
        System.out.println(leetCode1763.longestNiceSubstring("YazaAay"));

    }

    public String longestNiceSubstring(String s) {

        int len = s.length();
        int maxLen = 0;
        String answer = "";

        for(int i = 0; i < len; i++)
        {
            for(int j =i+1; j < len; j++)
            {
                String sub = s.substring(i, j+1);
                if(niceString(sub))
                {
                    if(sub.length() > maxLen)
                    {
                        maxLen = sub.length();
                        answer = sub;
                    }
                }
            }
        }

        return answer;
    }

    public boolean niceString(String st)
    {
        HashSet<Character> set = new HashSet<>();

        for(int i=0;i<st.length();i++)
        {
            set.add(st.charAt(i));
        }

        for(int i=0;i<st.length();i++)
        {
            if(Character.isLowerCase(st.charAt(i)) &&  !set.contains(Character.toUpperCase(st.charAt(i))))
            {
                return false;
            }

            if(Character.isUpperCase(st.charAt(i)) && !set.contains(Character.toLowerCase(st.charAt(i))))
            {
                return false;
            }
        }

        return true;
    }
}

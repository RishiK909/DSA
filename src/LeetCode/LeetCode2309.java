package LeetCode;

import java.util.HashSet;

public class LeetCode2309 {

    static void main() {

        LeetCode2309 lc = new LeetCode2309();
        System.out.println(lc.greatestLetter("rgFGerFGHB"));

    }

    public String greatestLetter(String s)
    {
        HashSet<Character> set = new HashSet<Character>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length();i++)
        {
            /*if(Character.isLowerCase(s.charAt(i)) &&  set.contains(Character.toUpperCase(s.charAt(i))))
            {
                sb.append(s.charAt(i));
            }*/
            if(Character.isUpperCase(s.charAt(i)) &&  set.contains(Character.toLowerCase(s.charAt(i))))
            {
                if(sb.isEmpty())
                {
                    sb.append(s.charAt(i));
                } else if (s.charAt(i) > sb.charAt(0))
                {
                    sb.setCharAt(0,s.charAt(i));
                }
            }
        }

        return sb.toString();

    }
}

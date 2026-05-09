package LeetCode;

public class LeetCode3461 {

    public boolean hasSameDigits(String s) {

        while(s.length() > 2)
        {
            StringBuilder sb = new StringBuilder();
            for(int i=1;i<s.length();i++)
            {
                int num = ((s.charAt(i-1) - '0') + (s.charAt(i) - '0'))%10;
                sb.append(num);
            }
            s = sb.toString();
        }

        return s.charAt(0) == s.charAt(1);
    }

    public static void main(String[] args) {

        LeetCode3461 leetcode = new LeetCode3461();
        String s = "3469";
        System.out.println(leetcode.hasSameDigits(s));
    }
}

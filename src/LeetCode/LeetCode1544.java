package LeetCode;

import java.util.Stack;

public class LeetCode1544 {
    public String makeGood(String s) {

        //Approach 1
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            while (i < s.length() && !stack.isEmpty() && stack.peek() != s.charAt(i)
                    && Character.toUpperCase(stack.peek()) == Character.toUpperCase(s.charAt(i))) {
                stack.pop();
                i += 1;
            }
            if (i < s.length())
                stack.add(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop());
        return sb.reverse().toString();

        //Approach 2
        Stack<Character>  stack = new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            if(!stack.isEmpty() && Math.abs(stack.peek() - s.charAt(i)) == 32)
            {
                stack.pop();
            }
            else
            {
                stack.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        LeetCode1544 leetcode = new LeetCode1544();
        System.out.println(leetcode.makeGood("s"));
    }
}

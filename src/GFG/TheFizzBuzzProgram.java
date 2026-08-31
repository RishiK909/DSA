package GFG;

import java.util.Scanner;

public class TheFizzBuzzProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // code here

        String s = FizzProgram(n);
        System.out.println("Answer: " + s);

    }

    public static String FizzProgram(int n)
    {
        if(n%3==0)
        {
            return "Fizz";
        }
        else if(n%5==0)
        {
            return "Buzz";
        }
        else
        {
            return "FizzBuzz";
        }
    }
}

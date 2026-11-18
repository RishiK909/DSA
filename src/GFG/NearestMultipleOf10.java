package GFG;

public class NearestMultipleOf10
{
    public static void main(String[] args)
    {
        String st = "15";
        NearestMultipleOf10 nearest = new NearestMultipleOf10();
//        System.out.println(nearest.roundToNearest(st));
    }

   /* public String roundToNearest(String s)
    {
        // Code Here

        Long num = Long.parseLong(s);

        if(num%10==0)
        {
            return String.valueOf(num);
        }

        Long remainder = num%10;

        Long lower = num - remainder;
        Long upper = lower + 10;

        if (num - lower <= upper - num) {
            return String.valueOf(lower);
        }

        return String.valueOf(upper);
1
    }*/

    /*public String roundToNearest(String s)
    {
        // s---> 25
        // s---> 26

        int len = s.length();
        if(s.charAt(len-1) <= '5')
        {

        }
    }*/
}

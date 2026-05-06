package LeetCode;

public class MinimumChairs3168 {
    public int minimumChairs(String s) {

        int countE = 0 , countL = 0 , max = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'E') countE++;
            else countE--;
            max = Math.max(countE,max);
        }
        return max;

    }

    public static void main(String[] args) {
        MinimumChairs3168 mc = new MinimumChairs3168();
        String s = "ELELEEL";
        System.out.println(mc.minimumChairs(s));
    }
}

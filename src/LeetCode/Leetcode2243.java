package LeetCode;

public class Leetcode2243 {

    public String digitSum(String s, int k) {


        while (s.length() > k) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s.length(); i += k) {
                String subString = s.substring(i, Math.min(i + k, s.length()));
                int sum = sum(subString);
                sb.append(sum);
            }

            s = sb.toString();
        }

        return s;
    }


        public int sum(String s) {
            int sum = 0;
            for (char c : s.toCharArray()) {
                sum += c - '0';
            }
            return sum;
        }


    public static void main(String[] args) {

        String s = "11111222223";
        int k = 3;
        Leetcode2243 leetcode2243 = new Leetcode2243();
        System.out.println(leetcode2243.digitSum(s,k));
    }

}

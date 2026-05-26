package LeetCode;

public class LeetCode482 {
        public String licenseKeyFormatting(String s, int k) {

            s = s.toUpperCase();
            //5F3Z2E9W
            String str = s.replace("-", "");
            //5F3Z2e9w


            StringBuilder sb = new StringBuilder();
            int count = 0;
            for(int i=str.length()-1; i>=0; i--)
            {
                sb.append(str.charAt(i));
                count++;
//                if(sb.length()%k==0 && i!=0)
                if(count == k && i!=0)
                {
                    sb.append("-");
                    count = 0;
                }
            }

            return sb.reverse().toString();
        }

    public static void main(String[] args) {
        LeetCode482 leetCode482 = new LeetCode482();
        System.out.println(leetCode482.licenseKeyFormatting("5F3Z-2e-9-w", 4));
    }
}


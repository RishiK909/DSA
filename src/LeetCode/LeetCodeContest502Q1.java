package LeetCode;

public class LeetCodeContest502Q1 {
    public boolean isAdjacentDiffAtMostTwo(String s) {

       /* boolean flag = false;
        for(int i=0;i<s.length() -1 ;i++){
            int ans = Math.abs(s.charAt(i) - s.charAt(i+1));
            if(ans <= 2)
            {
                flag = true;
            }else
            {
                flag = false;
            }
        }
        return flag;*/

        for(int i=0;i<s.length() -1 ;i++) {
            int ans = Math.abs(s.charAt(i) - s.charAt(i + 1));
            if(ans>2){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        LeetCodeContest502Q1 leetCode = new LeetCodeContest502Q1();
        System.out.println(leetCode.isAdjacentDiffAtMostTwo("301"));
    }
}


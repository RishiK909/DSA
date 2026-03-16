package LeetCode;

public class teemoAttacking {

    public int findPoisonedDuration(int[] timeSeries, int duration) {



        int total = 0;

        for(int i = 0; i < timeSeries.length - 1; i++){
            total += Math.min(duration, timeSeries[i+1] - timeSeries[i]);
        }

        total += duration;

        return total;

    }

    public static void main(String[] args) {

        int[] timeSeries = {1,4};
        int duration = 2;
        teemoAttacking teemoAttacking = new teemoAttacking();
        System.out.println(teemoAttacking.findPoisonedDuration(timeSeries, duration));
    }
}







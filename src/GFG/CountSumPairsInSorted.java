package GFG;

import java.util.HashMap;

public class CountSumPairsInSorted {

    public static void main(String[] args) {

        CountSumPairsInSorted solution = new CountSumPairsInSorted();
        int[] arr = {-1, 1, 5, 5, 7};
        int target = 6;
        System.out.println(solution.countPairs(arr,target));

    }

    int countPairs(int arr[], int target) {
        //  Code Here

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int num : arr)
        {
            int complement = target - num;

            count += map.getOrDefault(complement,0);

            map.put(num,map.getOrDefault(num,0)+1);
        }

        return count;

    }
}

package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < candidates.length; i++) {
            List<Integer> current = numEqualToTarget(candidates[i]);
            List<Integer> integers = sumEqualToTarget(current, target, sum);

            if (current.get(0) == target || !integers.isEmpty()) {
                result.add(current);
            }
        }

        return result;
    }

    public List<Integer> sumEqualToTarget(List<Integer> currents, int target, int sum) {
        List<Integer> current = new ArrayList<>(currents);
        List<Integer> sumCurrent = new ArrayList<>();

        for (int i = 0; i < current.size(); i++) {
            sum += current.get(i);

            if (sum == target) {
                sumCurrent.addAll(current);
            }
        }

        return sumCurrent;
    }

    public List<Integer> numEqualToTarget(int candidate) {
        List<Integer> current = new ArrayList<>();
        current.add(candidate);
        return current;
    }

    public static void main(String[] args) {
        LeetCode39 testCase = new LeetCode39();

        int[] candidates = {2, 7};
        int target = 7;

        System.out.println(testCase.combinationSum(candidates, target));
    }
}
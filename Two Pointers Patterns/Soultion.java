// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/

// TC: O(n.logn) SC:O(logn)  

import java.util.Collections;
import java.util.List;

public class Soultion {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int i = 0;
        int j = nums.size() - 1;
        int count = 0;

        while (i < j){
            int sum = nums.get(i) + nums.get(j);
            if(sum < target){
                count = count + (j-i);
                i = i + 1;
            } else {
                j = j - 1;
            }
        }
        return count;

    }
}

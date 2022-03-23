// @algorithm @lc id=1 lang=java 
// @title two-sum


package _1_Two_Sum;

import java.util.*;

// @test([2,7,11,15],9)=[0,1]
// @test([3,2,4],6)=[1,2]
// @test([3,3],6)=[0,1]
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums == null || nums.length == 0){
            return result;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                result[0] = map.get(temp);
                result[1] = i;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
// @algorithm @lc id=45 lang=java 
// @title jump-game-ii


package _45_Jump_Game_II;
import java.util.*;
// @test([2,3,1,1,4])=2
// @test([2,3,0,1,4])=2
public class Solution {
    public int jump(int[] nums) {
        if (nums.length == 1) return 0;

        int range = nums[0];
        int position = 0;
        int count = 0;
        while (position + range < nums.length) {
            int maxRange = 0;
            for (int i = position; i < position + range; i++) {
                if (nums[i] > maxRange) {
                    maxRange = nums[i];
                    position = i;
                }
            }
            range = maxRange;
            count ++;
        }
        return count + 1;
    }
}
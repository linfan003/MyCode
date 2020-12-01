//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表

package com.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class P1TwoSum {
    public static void main(String[] args) {
        Solution solution = new P1TwoSum().new Solution();
        int[] nums = new int[]{2, 7, 11, 15};
        int target =9;
        //int[] ints = solution.twoSum1(nums, target);
        int[] ints = solution.twoSum2(nums, target);
        for (int i = 0; i < ints.length; i++) {
            System.out.println((ints[i] + " "));
        }
    }
    class Solution {

        /**
         * 暴力破解：双指针循环
         */
        public int[] twoSum1(int[] nums, int target) {
            for (int i = 0; i < nums.length;i++) {
                for (int j = i+1; j < nums.length; j++) {
                    if (target - nums[i] == nums[j]) {
                        int[] end = new int[]{i,j};
                        return end;
                    }
                }
            }
            throw new IllegalArgumentException("No two sum solution");
        }

        /**
         * hash映射
         * @param nums
         * @param target
         * @return
         */
        public int[] twoSum2(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    return new int[] { map.get(complement), i };
                }
                map.put(nums[i], i);
            }
            throw new IllegalArgumentException("No two sum solution");
        }
    }
}
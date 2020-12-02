//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。 
//
// 示例 1: 
//
// 输入: 123
//输出: 321
// 
//
// 示例 2: 
//
// 输入: -123
//输出: -321
// 
//
// 示例 3: 
//
// 输入: 120
//输出: 21
// 
//
// 注意: 
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。 
// Related Topics 数学

package com.leetcode.editor.cn;

public class P7ReverseInteger {
    public static void main(String[] args) {
        Solution solution = new P7ReverseInteger().new Solution();
        int a = 955555888;
        int reverse = solution.reverse(a);
        System.out.println(reverse);
    }

    class Solution {
        public int reverse(int a) {
            int y = 0;
            while (a != 0) {
                int pop = a % 10;
                if (y > Integer.MAX_VALUE / 10 || y == Integer.MAX_VALUE && pop > 7) {
                    return 0;
                }
                if (y < Integer.MIN_VALUE / 10 || y == Integer.MIN_VALUE && pop < -8) {
                    return 0;
                }
                y = y * 10 + pop;
                a = a / 10;
            }
            return y;
        }
    }
}
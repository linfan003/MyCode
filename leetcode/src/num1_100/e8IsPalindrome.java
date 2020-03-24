package num1_100;


/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 *
 * 输入: 121
 * 输出: true
 * 示例 2:
 *
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 *
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
public class e8IsPalindrome {
    public static void main(String[] args) {
        e8IsPalindrome e8IsPalindrome = new e8IsPalindrome();
        int x = 10110;
        boolean palindrome = e8IsPalindrome.isPalindrome1(x);
        System.out.println(palindrome);
    }

    public boolean isPalindrome1(int x) {
        if (x < 0||(x % 10 == 0 && x != 0)) {
            return false;
        }
        int reverseNum = 0;
        while (reverseNum < x) {
            reverseNum = reverseNum * 10 + x % 10;
            x = x / 10;
        }
        return reverseNum == x || reverseNum / 10 == x;
    }
}

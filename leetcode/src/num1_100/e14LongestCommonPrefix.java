package num1_100;

public class e14LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s= new String[]{"flower", "flow", "flight"};
        String end = new e14LongestCommonPrefix().longestCommonPreFIx(s);
        System.out.println(end);
    }

    public String longestCommonPreFIx(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j=0;
            for (j = 0; j < ans.length() && j < strs[i].length(); j++) {
                if (ans.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            ans = ans.substring(0, j);
            if (ans.equals("")) {
                return ans;
            }
        }
        return ans;
    }
}

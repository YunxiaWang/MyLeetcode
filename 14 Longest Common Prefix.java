public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String t= strs[0];
        for (int i= 1; i < strs.length; i++) {
            if (strs[i].length() < t.length()) t= strs[i];
        }
        for (int i= 0; i < strs.length; i++) {
            if (!strs[i].startsWith(t)) {
                int count= 0;
                for (int j= 0; j < t.length(); j++) {
                    if (t.charAt(j) == strs[i].charAt(j)) count++;
                    else break;
                }
                t= t.substring(0, count);
            }
        }
        return t;
    }
}

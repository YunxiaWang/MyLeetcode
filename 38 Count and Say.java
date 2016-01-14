public class Solution {
    public String countAndSay(int n) {
        if (n <= 0) return null;
        if (n == 1) return "1";
        String s= countAndSay(n-1);
        String t= "";
        int count= 1;
        for (int i= 0; i < s.length(); i++) {
            if (i < s.length()-1 && s.charAt(i) == s.charAt(i+1))
                count++;
            else {
                t= t + count + s.charAt(i);
                count= 1;
            }
        }
        return t;
    }
}

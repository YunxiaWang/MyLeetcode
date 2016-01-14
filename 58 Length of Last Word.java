public class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() == 0) return 0;
        String t= s.trim();
        int i= t.length()-1; 
        int count= 0;
        while (i >= 0) {
            if (t.charAt(i) != ' ') {
                count++;
                i--;
            }
            else break;
        }
        return count;
    }
}

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] s= str.split(" "); //用split函数
        if (s.length != pattern.length()) return false;
        Map<Character, String> map= new HashMap<>();
        for (int i= 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) { //这里要加大括号 fk
                if (!map.get(pattern.charAt(i)).equals(s[i])) 
                    return false;
            }
            else if (map.containsValue(s[i])) return false;
            else map.put(pattern.charAt(i), s[i]);
        }
        return true;
    }
}

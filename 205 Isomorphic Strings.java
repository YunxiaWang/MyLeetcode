/*建两个hashmap维持字母间的对应关系，runtime太长*/
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> a= new HashMap<>();
        Map<Character, Character> b= new HashMap<>();
        for (int i= 0; i < s.length(); i++) {
            if (a.containsKey(s.charAt(i))) {
                if (a.get(s.charAt(i)) != t.charAt(i)) return false;
            }
            if (b.containsKey(t.charAt(i))) {
                if (b.get(t.charAt(i)) != s.charAt(i)) return false;
            }
            a.put(s.charAt(i), t.charAt(i));
            b.put(t.charAt(i), s.charAt(i));
        }
        return true;
    }
}
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();
        for(Integer i = 0; i < s.length(); i++) {
            if(m1.put(s.charAt(i), i) != m2.put(t.charAt(i), i)) {  
                return false; //'put' method returns the previous value associated with key, or null if there was no mapping for key.
            }
        }
        return true;
    }
}
/*用一个hashmap，时间减半*/
public class Solution {
    public boolean isIsomorphic(String s, String t) {
       if(s.length()==0 || s.length()==1)
          return true;
        Map<Character,Character> map = new HashMap<Character,Character>();
        for(int i=0; i<s.length(); i++){
          if(map.containsKey(s.charAt(i))){
            if(map.get(s.charAt(i))!=t.charAt(i))
                return false;
          }
          else if(map.containsValue(t.charAt(i)))
            return false;
          else map.put(s.charAt(i) , t.charAt(i));
        }
      return true;
    }
}

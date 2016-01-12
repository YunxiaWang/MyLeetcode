public class Solution {
    public boolean isPalindrome(String s) {
        /*if (s == null) return false;
        s= s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (s.length() <= 1) return true;
        for (int i= 1; i < s.length()/2; i++) {
            if (s.charAt(0) != s.charAt(s.length()-1)) return false;
            s= s.substring(1, s.length()-1); //对于长string，substring方法会超时
        }
        return true;*/
        if(s==null) return false;
		    s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); //去掉非字母数字，^为非
	    	for(int i = 0; i < s.length()/2 ; i++){ //只要到一半
			    if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
			  	  return false;
			    }
		    }
		return true;
    }
}
/*faster,use O(n) time and O(1) space*/
public class Solution {
    public boolean isPalindrome(String s) {
        int start = 0; 
        int end = s.length() - 1;
        while(start <= end) {
            while(start <= end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while(start <= end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if(start <= end && Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

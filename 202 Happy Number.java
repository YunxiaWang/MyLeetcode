/* The key to solve this problem is the stop condition for the loop. 
Non-happy number will loop endlessly in a [cycle] which does not include 1*/
public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>(); //use hashset to avoid repetitive number
        while (!set.contains(n)){
            set.add(n);
            n = sumSquare(n);
            if (n == 1) return true;
        }
        return false;
    }
    public int sumSquare(int n){
        if (n < 10) return n*n;
        return (n%10) * (n%10) + sumSquare(n/10);
    }
}

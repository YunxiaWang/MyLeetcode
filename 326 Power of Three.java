public class Solution { //21ms
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        if (n%3 != 0) return false;
        return isPowerOfThree(n/3);
    }
}
/*use log to avoid recursion*/
public class Solution { //19ms
    public boolean isPowerOfThree(int n) {
        double a = Math.log(n) / Math.log(3);
        return Math.abs(a - Math.rint(a)) <= 0.00000000000001;
    } //rint(double a): Returns the double value that is closest in value to the argument and is equal to a mathematical integer.
}

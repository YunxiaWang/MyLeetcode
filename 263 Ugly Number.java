/* 最直接的办法就是不停的除以这些质数，如果剩余的数字是1的话就是ugly number了，有两种写法 */
public class Solution {
    public boolean isUgly(int num) { 
        while (num >= 2){
            if (num % 2 == 0) num /= 2;
            else if (num % 3 == 0) num /= 3;
            else if (num % 5 == 0) num /= 5;
            else return false; // use else if, return false at the end of loop body
         }
         return num == 1;
    }
}
 /* slower than previous one */
public class Solution {
    public boolean isUgly(int num) {
        if (num <= 0) return false;
        while (num % 2 == 0) num /= 2;
        while (num % 3 == 0) num /= 3;
        while (num % 5 == 0) num /= 5;
        return num == 1;
    }
}

public class Solution {
    public int addDigits(int num) {
        if (num < 10) return num;
        int sum = num%10 + addDigits(num/10);
        if (sum < 10) return sum;
        return addDigits(sum);
    }
}

/* Do it without any loop/recursion in O(1) runtime:
Digital root:
if n=0; sum=0;
if n%9=0; sum=9;
else sum=n%9;
To generalize the concept of digital roots to other bases b, one can simply change the 9 in the formula to b - 1.
*/
public class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        if (num % 9 == 0) return 9;
        return num % 9;
    }
}

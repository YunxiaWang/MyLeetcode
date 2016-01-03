public class Solution {
    public int addDigits(int num) {
        if (num < 10) return num;
        int sum = num%10 + addDigits(num/10);
        if (sum < 10) return sum;
        return addDigits(sum);
    }
}

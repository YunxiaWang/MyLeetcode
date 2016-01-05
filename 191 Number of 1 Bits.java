/*1. 输入值n可能为负数（但应视其为无符号整数，但Java中实际上是没有无符号整数的）
2. 使用无符号右移操作，可以忽略符号位。*/
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){ //use '!=' instead of '>' because n could be negative
            count += n & 1;
            n >>>= 1;  
        } 
        return count;
    }
}
/* '&' (bitwise and):Binary AND Operator copies a bit to the result if it exists in both operands.
'>>>' (zero fill right shift):Shift right zero fill operator.The left operands value is moved right
by the number of bits specified by the right operand and shifted values are filled up with zeros.*/

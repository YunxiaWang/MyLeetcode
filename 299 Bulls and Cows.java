/*创建一个包含10个数字的数组，分别用于记录遇到的每个数字的个数。这个方法只需要遍历一次数组。*/
public class Solution {
    public String getHint(String secret, String guess) {
        int a= 0; int b= 0;
        int[] count= new int[10];
        for (int i= 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) a++;
            else {
                count[secret.charAt(i)-'0']++; //secret里包含则加1
                if (count[secret.charAt(i)-'0'] <= 0) //数字在guess中出现过则为-，在secret中出现再+还<=0，则有重复
                    b++;
                count[guess.charAt(i)-'0']--; //guess里包含则减1
                if (count[guess.charAt(i)-'0'] >= 0)
                    b++;
            }
        }
        return a + "A" + b + "B";
    }
}

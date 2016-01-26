public class Solution {
    //别 拼 错。。。记得加空格 大写
    String[] digit= {"", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ", "Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "}; //0-18
    String[] tens= {"", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "}; //0-7
    
    public String numberToWords(int num) {
        if (num == 0) return "Zero"; //特殊情况
        String result= "";
        if (num/1000000000 != 0) 
            result= digit[num/1000000000] + "Billion ";
        if ((num/1000000)%1000 != 0)
            result += threeDigit((num/1000000)%1000) + "Million ";
        if ((num/1000)%1000 != 0) 
            result += threeDigit((num/1000)%1000) + "Thousand ";
        result += threeDigit(num%1000);
        return result.trim(); //记得去掉最后的空格
    }
        
    public String threeDigit(int num) {
        String result= "";
        if (num%100 < 20) {
            result = digit[num%100] + result;
        } else {
            result = tens[(num/10)%10-1] + digit[num%10] + result;
        }
        if (num/100 != 0) {
            result = digit[num/100] + "Hundred " + result;
        }
        return result;
    }
}

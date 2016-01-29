public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> result= new ArrayList<>();
        int res= 0;
        List<Integer> leftResult, rightResult;
        for (int i= 0; i <input.length(); i++) {
            char op= input.charAt(i); 
            if (op == '+' || op == '-' || op == '*') { //以运算符为分割点，recursively计算左边和右边的结果
                leftResult= diffWaysToCompute(input.substring(0,i));
                rightResult= diffWaysToCompute(input.substring(i+1));
                for (int left: leftResult) {
                    for (int right: rightResult) {
                        if (op == '+') res = left + right;
                        else if (op == '-') res = left - right;
                        else res = left * right;
                        result.add(res);
                    }
                }
            }
        }
        if (result.size() == 0) { //base case, a single number
            result.add(Integer.parseInt(input));
            return result;
        }
        return result;
    }
}

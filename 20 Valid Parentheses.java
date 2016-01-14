public class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0) return true;
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack= new Stack<>();
        int i= 0;
        while (i < s.length()) { //逻辑顺序很重要
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
                i++;
            }
            else if (!stack.empty() && (stack.peek() == '(' && s.charAt(i) == ')' || stack.peek() == '[' && s.charAt(i) == ']' || 
            stack.peek() == '{' && s.charAt(i) == '}')) { //要先判断stack是否为空
                stack.pop();
                i++;
            }
            else return false;
        }
        if (stack.empty()) return true; ////要先判断stack是否为空
        return false;
    }
}

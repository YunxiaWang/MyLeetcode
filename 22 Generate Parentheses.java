public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list= new ArrayList<>();
        backtrack(list, "", n, n);
        return list;
    }
    public void backtrack(List<String> list, String string, int left, int right) {
        if (left == 0 && right == 0) {
            list.add(string);
            return;
        }
        if (left > 0) backtrack(list, string+"(", left-1, right);
        if (right > left) backtrack(list, string+")", left, right-1);
    }
}

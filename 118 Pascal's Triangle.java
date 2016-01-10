public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result= new ArrayList<>();//这种简写可以用
        List<Integer> list= new ArrayList<>();
        if (numRows == 0) return result;
        list.add(1);
        result.add(list);
        list= new ArrayList<Integer>();
        if (numRows == 1) return result;
        list.add(1); list.add(1);
        result.add(list);
        list= new ArrayList<Integer>();
        if (numRows == 2) return result;
        for (int i= 2; i < numRows; i++){
            list.add(1);
            for (int j= 1; j < i; j++){
                int t= result.get(i-1).get(j-1) + result.get(i-1).get(j);
                list.add(t);
            }
            list.add(1);
            result.add(list);
            list= new ArrayList<Integer>();
        }
        return result;
    }
}

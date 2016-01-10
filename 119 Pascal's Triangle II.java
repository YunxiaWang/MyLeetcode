public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result= new ArrayList<Integer>();
        result.add(1);
        if (rowIndex == 0) return result;
        result.add(1);
        if (rowIndex == 1) return result;
        List<Integer> pre= new ArrayList<Integer>(result); //存前一级的数值
        //pre = result.clone(); //不能用clone函数
        for (int i= 2; i <= rowIndex; i++) {
            for (int j= 1; j < i; j++) {
                result.set(j, pre.get(j-1) + pre.get(j));
            }
            result.add(1);
            pre= new ArrayList<Integer>(result); //用构造函数赋值，不能用‘=’，不然会指向同一个对象
        }
        return result;
    }
}

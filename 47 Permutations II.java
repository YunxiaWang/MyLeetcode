public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        if (nums.length == 0) return result;
        List<Integer> list= new ArrayList<>();
        list.add(nums[0]);
        result.add(list);
        for (int n= 1; n < nums.length; n++) { //n次循环后只留有含N个数的list
            for (int r= result.size(); r > 0; r--) {
                list= result.remove(0); //从头依次取出（n-1)list中的所有元素
                for (int i= 0; i <= list.size(); i++) { //因为要在原list上加，所以要复制再改动，保存原list
                    List<Integer> t= new ArrayList<>(list);
                    t.add(i, nums[n]); //把第n个元素加到(n-1)list的每一个位置上
                    if (!result.contains(t)) result.add(t); //不包含则加入 runtime is horrible
                }
            }
        }
        return result;
    }
}

/*use set, faster*/
public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> result= new HashSet<>();
        if (nums.length == 0) return new ArrayList<List<Integer>>();
        List<Integer> list= new ArrayList<>();
        list.add(nums[0]);
        result.add(list);
        for (int n= 1; n < nums.length; n++) { //n次循环后只留有含N个数的list
            Set<List<Integer>> newResult= new HashSet<>(); //contain new result, since old result is not deleted
            for (List<Integer> l: result) {
                for (int i= 0; i <= l.size(); i++) { 
                    List<Integer> t= new ArrayList<>(l);
                    t.add(i, nums[n]);
                    newResult.add(t); 
                }
            }
            result= newResult;
        }
        return new ArrayList<List<Integer>>(result); //type refine
    }
}

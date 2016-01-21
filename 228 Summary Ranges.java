public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list= new ArrayList<>();
        if (nums.length == 0) return list;
        String s= "";
        s += nums[0];
        boolean single = true; //设flag判断是否只有一个数字
        for (int i= 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]+1) {
                if (!single) s = s + "->" + nums[i-1];
                list.add(s);
                s = "" + nums[i];
                single = true;
            } else if (i == nums.length-1){ //处理最后一位连续数字
                s= s + "->" + nums[i];
            } else {
                single = false;
            }
        }
        list.add(s); //加上最后一组
        return list;
    }
}

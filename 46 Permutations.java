/*the basic idea is, to permute n numbers, we can add the nth number into the resulting List<List<Integer>> from the n-1 numbers, in every possible position.
For example, if the input num[] is {1,2,3}: First, add 1 into the initial List<List<Integer>> (let's call it "answer").
Then, 2 can be added in front or after 1. So we have to copy the List in answer (it's just {1}), add 2 in position 0 of {1}, 
then copy the original {1} again, and add 2 in position 1. Now we have an answer of {{2,1},{1,2}}. There are 2 lists in the current answer.
Then we have to add 3. first copy {2,1} and {1,2}, add 3 in position 0; then copy {2,1} and {1,2}, and add 3 into position 1, 
then do the same thing for position 3. Finally we have 2*3=6 lists in answer, which is what we want.*/
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
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
                    result.add(t);
                }
            }
        }
        return result;
    }
}

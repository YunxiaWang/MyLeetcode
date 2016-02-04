/* G(i)=i^(i/2)
https://en.wikipedia.org/wiki/Gray_code#Converting_to_and_from_Gray_code */
public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list= new ArrayList<>();
        for (int i= 0; i < (1<<n); i++)
            list.add(i^(i>>1));
        return list;
    }
}

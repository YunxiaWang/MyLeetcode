/*The key to solve the problem is defining a fake head. Then compare the first elements from each list. 
Add the smaller one to the merged list. Finally, when one of them is empty, simply append it to the merged list, 
since it is already sorted.增加头指针，保存第一个节点位置*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode fakeHead = new ListNode(0); // new object 'fakeHead'
        ListNode p = fakeHead; // 使p指向fakeHead,两个变量（引用）指向同一个对象
        while(l1 != null && l2 != null){
          if(l1.val <= l2.val){
              p.next = l1; // 等同于给fakeHead.next赋值
              l1 = l1.next;
          }else{
              p.next = l2;
              l2 = l2.next;
          }
          p = p.next;
        }
        if(l1 != null)
            p.next = l1;
        if(l2 != null)
            p.next = l2;
        return fakeHead.next;
    }
}

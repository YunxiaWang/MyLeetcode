/**有以下几种思路：
（1）暴力破解，遍历链表A的所有节点，并且对于每个节点，都与链表B中的所有节点比较，退出条件是在B中找到第一个相等的节点。
时间复杂度O(lengthA*lengthB)，空间复杂度O(1)。
（2）哈希表。遍历链表A，并且将节点存储到哈希表中。接着遍历链表B，对于B中的每个节点，查找哈希表，如果在哈希表中找到了，
说明是交集开始的那个节点。时间复杂度O(lengthA+lengthB)，空间复杂度O(lengthA)或O(lengthB)。
（3）双指针法，指针pa、pb分别指向链表A和B的首节点。遍历链表A，记录其长度lengthA，遍历链表B，记录其长度lengthB。因为两个链表的长度
可能不相同，比如题目所给的case，lengthA=5，lengthB=6，则作差得到lengthB-lengthA=1，将指针pb从链表B的首节点开始走1步，即指向了第二个节点，
pa指向链表A首节点，然后它们同时走，每次都走一步，当它们相等时，就是交集的节点。时间复杂度O(lengthA+lengthB)，空间复杂度O(1)。
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode a= headA;
        ListNode b= headB;
        int la= 0;
        int lb= 0;
        while (a != null) {
            a= a.next;
            la++;
        }
        while (b != null) {
            b= b.next;
            lb++;
        }
        a= headA;
        b= headB;
        int c= la - lb;
        int l= la<=lb ? la : lb;
        if (c >= 0) {
            for (int i= 0; i < c; i++)
                a= a.next;
        } else {
            for (int i= 0; i < (0-c); i++)
                b= b.next;
        }
        for (int i= 0; i < l; i++) {
            if (a == b) return a;
                a= a.next;
                b= b.next;
        }
        return null;
    }
}

/**
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
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        if(head1==null || head2==null){
            return null;
        }
        ListNode p1 =head1;
        ListNode p2 =head2;
        while(p1 != p2){
            p1=(p1 == null) ? head2:p1.next;
            p2=(p2 == null) ? head1 :p2.next;
        }
        return p1;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode ref = head.next;
        ListNode temp;
        ListNode prevNode = null;
        while(head != null && head.next != null) {
            temp = head.next;
            head.next = temp.next;
            temp.next = head;
            if(prevNode != null) {
                prevNode.next = temp;
            }
            prevNode = head;
            head = head.next;
        }
        return ref;
    }
}
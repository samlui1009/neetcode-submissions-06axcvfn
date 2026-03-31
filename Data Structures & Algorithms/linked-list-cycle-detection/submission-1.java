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
    public boolean hasCycle(ListNode head) {
        // When working with LinkedLists, you always need to have 
        // An edge case where if the head node is NULL
        if (head == null) {
            return false;
            // In the case where the head is null, it will ALWAYS be false 
            // Cause we know that means the list doesn't exist at all
            // And there's no cycle
        }
        ListNode hare = head;
        ListNode turt = head;
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turt = turt.next;
            if (hare == turt) {
                return true;
            }
        }
        return false;
    }
}

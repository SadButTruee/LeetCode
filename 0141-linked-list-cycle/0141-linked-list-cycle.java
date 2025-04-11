/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next == null ? null : fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;        
    }
    

    private Optional<ListNode> getNextFirst(ListNode head) {
        return Optional.ofNullable(head).map(node -> node.next);
    }

        private Optional<ListNode> getNextSecond(ListNode head) {
        return Optional.ofNullable(head).map(node -> node.next).map(node -> node.next);
    }
}
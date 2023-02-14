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
        ListNode leading = head;
        ListNode lagging = head;
        while(leading != null && lagging != null && leading.next != null){
            lagging = lagging.next;
            leading = leading.next.next;
            if(leading == lagging){
                return true;
            }
        }
        return false;
    }
}
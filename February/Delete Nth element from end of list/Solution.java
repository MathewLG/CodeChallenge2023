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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode leading = head;
        ListNode aux = new ListNode();
        aux.next = head;
        ListNode lagging = aux;
        int counter = 0;
        while(leading.next != null){
            leading = leading.next;
            counter++;
            if(counter >= n){
                lagging = lagging.next;
            }
        }
        lagging.next = lagging.next.next;
        return aux.next;

    }
}
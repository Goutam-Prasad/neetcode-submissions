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

// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//      int size=0;
//      ListNode curr=head;

//      while(curr!=null){
//         curr=curr.next;
//         size++;
//      }
//      if(size==n){
//         return head.next;
//      }
//      int dist=size-n-1;
//      curr=head;

//      while(dist>0){
//         curr=curr.next;
//         dist--;
//      }
//      curr.next=curr.next.next;
//      return head;
//     }
// }

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // dummy node handles edge case of removing head
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        // Step 1 — move fast n steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // Step 2 — move both until fast reaches last node
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Step 3 — remove the target node
        slow.next = slow.next.next;

        return dummy.next;
    }
}


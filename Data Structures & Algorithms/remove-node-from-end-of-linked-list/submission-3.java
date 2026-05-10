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

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}


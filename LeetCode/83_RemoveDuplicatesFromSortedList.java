package rocket.LeetCode;
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummyNode = new ListNode(-101, head);//generate a dummy node
        ListNode cur = head;
        while(cur != null && cur.next != null){
            if(cur.val == cur.next.val){
                cur.next = cur.next.next;//If the value of the current is equal to the value of the next Node, point the pointer of the current Node tho the next next Node
            }else{
                cur = cur.next; //If not the same, move directly to the next Node
            }
        }
     
        return dummyNode.next; //return the next node of dummy node

    }
}
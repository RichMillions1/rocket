package rocket.LeetCode;

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        //generate a new Node as a dummy head node to avoid the case of an empty list
        ListNode dummyNode = new ListNode(-1);

        //generate a new Node as pointer traverse the whole list
        ListNode cur = head;

        //put the dummy Node before the head Node
        dummyNode.next = head;

        //generate a pre-node
        ListNode pre = dummyNode;

            
        while(cur != null){//the loop continues while cur node not equal null 
            if(cur.val == val){
                pre.next = cur.next; //Point the previous node to the next node of current node if cur.val == val
            }else{
                pre = pre.next; //Move the pre to the next node if cur.val != val
            }
            cur = cur.next;// Move the cur to the next node
        }

        return dummyNode.next;// return the list except the dummyNode

    }
}
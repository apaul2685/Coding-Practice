package LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class cycleDetection {

    public static boolean cycledetection(ListNode head){

        if(head==null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }

        return false;

    }
}

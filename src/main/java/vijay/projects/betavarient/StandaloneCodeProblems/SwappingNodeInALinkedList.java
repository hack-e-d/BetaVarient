package vijay.projects.betavarient.StandaloneCodeProblems;

public class SwappingNodeInALinkedList {
//      Definition for singly-linked list.
     public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
     public static int size(ListNode root){
            int len = 0;
            while(root != null){
                len ++;
                root = root.next;
            }
            return len;
        }
        public static ListNode swapNodes(ListNode head, int k) {
            if(head == null || head.next == null) return head;
            int len = size(head);
            ListNode pointer = head,first =null, second = null;
            int pos = 0;
            while(pointer != null) {
                if(pos == k - 1) {
                    first = pointer;
                }
                if(pos == len-k) {
                    second = pointer;
                }
                if(first != null && second != null) {
                    break;
                }
                pointer = pointer.next;
                pos++;
            }
            if (first.val != second.val) {
                first.val = first.val + second.val;
                second.val = first.val - second.val;
                first.val = first.val - second.val;
            }
            return head;
        }

    public static void main(String[] args) {
        ListNode one, two, three;
        one = new ListNode(1);
        two = new ListNode(2);
        three = new ListNode(3);

        one.next = two;
        two.next = three;
        one = swapNodes(one,2);
        System.out.println(one.val);
    }
}

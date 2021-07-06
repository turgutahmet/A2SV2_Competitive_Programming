import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
//https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeTwoSortedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode l2 = new ListNode(1,new ListNode(3,new ListNode(4)));
        ArrayList<Integer> list = new ArrayList<>();
        while(l1 != null || l2 != null){
            if(l1 !=null){ list.add((l1.val)); }
            if(l2 !=null){ list.add((l2.val)); }
            if(l1 != null)l1 = l1.next;
            if(l2 !=null )l2 = l2.next;
        }
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
        ListNode head = null;
        ListNode tail = null;
        for(int ii=0 ; ii < list.size() ; ii++){
            ListNode newNode = new ListNode((list.get(ii)));
            if(head == null) {
                head = newNode;
                tail = newNode;
            }else {
                ListNode temp = head;
                head = newNode;
                head.next = temp;
            }
        }
    }
}

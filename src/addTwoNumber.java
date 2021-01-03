import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class addTwoNumber {

    public static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }
    public static void main (String []args){
        ListNode head = null;
        ListNode tail = null;
        ListNode l1 = new ListNode (9);
        ListNode l2 = new ListNode (1, new ListNode(9, new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))))))))));
        int first = 0;
        int second = 0;
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();

        while(l1 != null || l2 != null){
            if(l1 !=null){ one.append(String.valueOf(l1.val)); }
            if(l2 !=null){ two.append(String.valueOf(l2.val)); }
            if(l1 != null)l1 = l1.next;
            if(l2 !=null )l2 = l2.next;
        }
        one = one.reverse();
        two = two.reverse();
        int iter = one.length();
        int iter2 = two.length();
        int size = Math.max(iter,iter2);
        StringBuilder REAL = new StringBuilder();
        int can = 0;
        for(int i = size  ; i >= 0 ; i-- ){
            int k = 0,j = 0,prev = can;
            iter = iter -1;
            iter2 = iter2 -1;
            if(iter >= 0){
                k = Character.getNumericValue(one.charAt(iter));
            }
            if(iter2 >= 0){
                j = Character.getNumericValue(two.charAt(iter2));
            }
            int sum = k+j+can;
            if(sum >= 10){
                sum = sum - 10;
                can = 1;
            }else {
                can = 0;
            }
            if(REAL.length() >= size){
                if(prev == 1){ REAL.append(sum); }
            }else REAL.append(sum);

        }
        REAL.reverse();
        System.out.println("Number:" +REAL);
        for(int ii=0 ; ii < REAL.length() ; ii++){
            ListNode newNode = new ListNode(Character.getNumericValue(REAL.charAt(ii)));
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

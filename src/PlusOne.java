import java.util.ArrayList;
import java.util.Collections;

public class PlusOne {
    //https://leetcode.com/problems/plus-one/

    public static void main(String[] args) {
        int[] digits = {9};
        int remain = 0;
        int extra = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int ii =  digits.length-1 ; ii >= 0 ; ii--){
            remain = digits[ii]+ extra;
            extra = 0;
            if(ii == digits.length -1){
                remain ++;
                if(remain % 10 == remain){
                    numbers.add(remain);
                }else{
                    numbers.add(remain%10);
                    extra = 1;
                }
                continue;
            }

            if(remain % 10 == digits[ii]){
                numbers.add(remain);
            }else {
                numbers.add(remain%10);
                if(remain>= 10){
                    extra =1;
                }

            }
        }
        if(extra == 1){
            numbers.add(1);
        }
        Collections.reverse(numbers);
        int[] newDigits = new int[numbers.size()];
        for (int jj = 0; jj< newDigits.length;jj++){
            newDigits[jj] = numbers.get(jj);
        }
        for (int i: newDigits
             ) {
            System.out.println(i);
        }
    }
}

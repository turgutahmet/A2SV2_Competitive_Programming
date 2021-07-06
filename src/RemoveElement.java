import java.util.ArrayList;
//https://leetcode.com/problems/remove-element/
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        ArrayList<Integer> list = new ArrayList<>();
        for(int ii = 0 ; ii< nums.length ; ii++){
            if(nums[ii] != val){
                list.add(nums[ii]);
            }
        }
        int jj=0;
        for (Integer i: list) {
            nums[jj] = list.get(jj);
            jj++;
        }

        System.out.println(list);
        System.out.println(list.size());
    }
}

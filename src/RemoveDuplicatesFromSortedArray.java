import java.util.ArrayList;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        ArrayList<Integer> list = new ArrayList<>();
        for(int ii = 0 ; ii< nums.length ; ii++){
            if(!list.contains(nums[ii])){
                list.add(nums[ii]);
            }
        }
        int jj=0;
        for (Integer i: list) {
            nums[jj] = list.get(jj);
            jj++;
        }
        System.out.println(list.size());
    }
}

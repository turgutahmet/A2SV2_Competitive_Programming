public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 0,ii = 0,output = 0;
        for( ii = 0; ii< nums.length; ii++){
            if(nums[ii] < target){
                continue;
            }else{
                output = ii;
                break;
            }
        }
        if(output == 0 && ii == nums.length){
            output = nums.length;
        }
        System.out.println(output);
    }
}

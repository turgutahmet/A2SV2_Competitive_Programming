public class MaximumSubarray {
    //https://leetcode.com/problems/maximum-subarray/
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int max = nums[0];
        int sum = nums[0];

        for(int jj = 1; jj <nums.length; jj++){
            int temp = nums[jj] + sum;
            sum = Math.max(temp,nums[jj]);
            max = Math.max(max,sum);
        }
        System.out.println(max);
    }
}

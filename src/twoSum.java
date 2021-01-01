public class twoSum {
    public static void main(String []args){
        //https://leetcode.com/problems/two-sum/
        int [] nums = {3,2,4};
        int target = 6;
        int index = 0,index1 = 0;
        boolean finished = false;
        int [] arr = new int[2];

        for (int num : nums) {
            index1 = 0;
            for (int num1 : nums) {
                if(index==index1){
                    index1++; continue;
                }
                if(num+num1 == target){
                    finished = true;break;
                }
                index1++;
            }
            if (finished)break;
            index++;
        }

        if(index<index1){
            arr[0] = index;
            arr[1] = index1;
        }else{
            arr[1] = index;
            arr[0] = index1;
        }
        for (int i : arr) {
            System.out.println(i);
        }

    }
}

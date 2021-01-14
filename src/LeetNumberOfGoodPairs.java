import java.util.ArrayList;

public class LeetNumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        ArrayList<String> locations = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < nums.length ; i++) {
            int index2 = 0;
            for(int j = 0; j < nums.length ; j++){

                if(nums[i] == nums [j] && index != index2){
                    String s = "("+index+","+index2+")";
                    String s2 = "("+index2+","+index+")";
                    if(!(locations.contains(s) || locations.contains(s2))){
                        locations.add(s);
                    }
                }
                index2++;
            }
            index++;
        }
        System.out.println(locations.size());

    }
}


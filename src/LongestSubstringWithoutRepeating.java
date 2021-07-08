import java.util.ArrayList;

public class LongestSubstringWithoutRepeating {
    //https://leetcode.com/problems/longest-substring-without-repeating-characters/
    public static void main(String[] args) {
        String s = "abcabcbb";
        ArrayList<String> str = new ArrayList<>();
        String output = "";
        int index = 0;
        for(int ii = 0; ii < s.length() ; ii++){
            if(output == ""){
                index = ii;
            }
            if(!output.contains(Character.toString(s.charAt(ii)))){
                output = output + s.charAt(ii);
                if(s.length() == ii+1){
                    str.add(output);
                }
            }else {
                str.add(output);
                ii = index ;
                output = "";
            }

        }
        int size = 0;
        for(String strstr : str){
            if(strstr.length() > size){
                size = strstr.length();
            }
        }
        System.out.println(size);
    }
}

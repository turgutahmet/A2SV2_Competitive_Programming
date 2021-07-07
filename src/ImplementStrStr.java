import java.util.ArrayList;

public class ImplementStrStr {
    //https://leetcode.com/problems/implement-strstr/
    public static void main(String[] args) {
        String haystack = "hlello";
        String needle = "ll";


        if(haystack.contains(needle)){

            int output = haystack.indexOf(needle);
            System.out.println(output);
        }else {
            System.out.println(-1);
        }
    }
}

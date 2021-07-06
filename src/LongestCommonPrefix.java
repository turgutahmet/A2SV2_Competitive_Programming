import org.w3c.dom.ls.LSOutput;

//https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"c","ac"};
        String prefix = "";
        int index = 0;
        int control = 0;
        for(char c: str[0].toCharArray()){
            for(int i=1;i< str.length;i++){
               if(index < str[i].length() && str[i].charAt(index) == c){
                   control = 1;
               }else{
                   control = 0;
                   return prefix;
               }
            }
            if(control == 1){
                prefix = prefix +c;
            }
            index++;
            control=0;
        }
        if(str.length == 1){
            prefix = str[0];
        }
       return prefix;
    }

}

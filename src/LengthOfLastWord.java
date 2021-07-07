public class LengthOfLastWord {
    //https://leetcode.com/problems/length-of-last-word/

    public static void main(String[] args) {

        String s = "a b ";
        int count = 0;

        for (int ii= s.length()-1; ii >= 0; ii--) {
            if(s.charAt(ii) != ' '){
                count++;
            }else if(s.charAt(ii) == ' ' && s.charAt(s.length()-1)!=' '){
                break;
            }else if(s.charAt(ii) == ' ' && count > 0){
                break;
            }
        }

        System.out.println(count);
    }
}

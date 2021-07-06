import java.util.ArrayList;
//https://leetcode.com/problems/valid-parentheses/

public class ValidParentheses {
    public static void main(String[] args) {

        String s = "([}}])";

        if(s.length() % 2 != 0) System.out.println("false");
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0;i < s.length();i++){
            if(s.charAt(i) == '('||s.charAt(i) =='['||s.charAt(i) =='{'){
                list.add(s.charAt(i));
            }else if(s.charAt(i) == ')' && list.size()!= 0 && list.get(list.size()-1) == '('){
                list.remove(list.size()-1);
            }else if(s.charAt(i) == ']' && list.size()!= 0 && list.get(list.size()-1) == '['){
                list.remove(list.size()-1);
            }else if(s.charAt(i) == '}' && list.size()!= 0 && list.get(list.size()-1) == '{'){
                list.remove(list.size()-1);
            }else System.out.println(false);

        }
        if(list.size() == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }
}

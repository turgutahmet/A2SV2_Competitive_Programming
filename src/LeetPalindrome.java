//https://leetcode.com/problems/palindrome-number/
public class LeetPalindrome {
    public static void main(String[] args) {
        int x = -121;
        String str = Integer.toString(x);
        StringBuilder test = new StringBuilder();
        test.append(str);
        test.reverse();
        String str2 = test.toString();
        if(str2.equals(str)){
            System.out.println("yes");
        }

    }
}

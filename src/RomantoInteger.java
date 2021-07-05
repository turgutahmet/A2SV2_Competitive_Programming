import java.util.HashMap;
//https://leetcode.com/problems/roman-to-integer/
public class RomantoInteger {

    public static void main(String[] args) {
        String s = "MCMXCIV";
        char[] ch = s.toCharArray();
        HashMap<Character,Integer> roman = new HashMap<Character,Integer>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);

        int before = 0,now = 0;
        int number = 0;
        for (int i=0;i<ch.length;i++){

            now = roman.get(ch[i]);
            number += now;
            if(now > before ){
                number -= 2*before;
            }
            before = roman.get(ch[i]);

        }

        System.out.println(number);
    }
}

import jdk.swing.interop.SwingInterOpUtils;

public class reverseInteger {
    public static void main(String []args)
    {
        int x = reverse(-123);
        System.out.println(x);//-321
    }

    public static int reverse(int x){

        boolean isNegative = false;
        if (x < 0) {
            x = Math.abs(x);
            isNegative = true;
        }

        long reverseNumber = 0;
        int realNumber = x;

        while (realNumber > 0) {
            int mod = realNumber % 10;
            realNumber = realNumber / 10;
            reverseNumber = (reverseNumber * 10) + mod;
        }

        if(reverseNumber > Integer.MAX_VALUE)return 0;
        else if(reverseNumber < Integer.MIN_VALUE) return 0;

        if (isNegative) { return (int) -reverseNumber; }else return (int) reverseNumber;

    }
}

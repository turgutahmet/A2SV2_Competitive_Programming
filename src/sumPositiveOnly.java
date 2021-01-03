public class sumPositiveOnly {
    public static void main(String[] args) {
        String num1 = "42131233213213";
        String num2 = "1233123123213213";
        StringBuilder numberOne = new StringBuilder(num1);
        StringBuilder numberTwo = new StringBuilder(num2);

        int iter = numberOne.length();
        int iter2 = numberTwo.length();
        int size = Math.max(iter, iter2);
        StringBuilder str = new StringBuilder();
        int can = 0;
        for (int i = size; i >= 0; i--) {
            int k = 0, j = 0, prev = can;
            iter = iter - 1;
            iter2 = iter2 - 1;
            if (iter >= 0) {
                k = Character.getNumericValue(numberOne.charAt(iter));
            }
            if (iter2 >= 0) {
                j = Character.getNumericValue(numberTwo.charAt(iter2));
            }
            int sum = k + j + can;
            if (sum >= 10) {
                sum = sum - 10;
                can = 1;
            } else {
                can = 0;
            }
            if (str.length() >= size) {
                if (prev == 1) {
                    str.append(sum);
                }
            } else str.append(sum);

        }
        str.reverse();

        System.out.println(str);


    }
}

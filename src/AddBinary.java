public class AddBinary {
   //https://leetcode.com/problems/add-binary/

    public static void main(String[] args) {
        String a = "1111";
        String b = "1111";
        int sizeA = a.length();
        int sizeB = b.length();
        String output ="";
        if(sizeA > sizeB){
           for(int ii = 0; ii < sizeA - sizeB; ii++){
               b = "0" + b;
           }
        }else if(sizeB > sizeA){
            for(int ii = 0; ii < sizeB - sizeA; ii++){
                a = "0" + a;
            }
        }
        int elde = 0;
        for(int ii = a.length() -1 ; ii >= 0; ii--){
            int sum = Character.getNumericValue(a.charAt(ii)) + Character.getNumericValue(b.charAt(ii));
            sum = sum +elde;
            elde = 0;
            if(sum == 2){
                elde = 1;
                output = "0" + output;
            }else  if(sum == 3){
                output = "1" + output;
                elde = 1;
            }else if(sum == 0){
                output = "0" + output;
            }else output = "1" + output;
        }
        if(elde == 1){
            output = "1"+output;
        }
        System.out.println(output);

    }
}

import java.util.Scanner;

public class Triangle2 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int loop = number;
        for(int ii = 1; ii <= loop ; ii++){
            for(int kk = number; kk>0; kk--){
                System.out.print(" ");
            }
            for(int jj=0; jj < (ii*2)-1 ; jj++){
                System.out.print("*");
            }
            System.out.println();
            number--;
        }
    }
}

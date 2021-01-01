import java.util.Scanner;

public class Triangle1 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int ii=1;ii <= number; ii++){
            for(int jj=0; jj < ii ; jj++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

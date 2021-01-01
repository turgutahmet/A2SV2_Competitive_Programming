//https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
import java.util.ArrayList;

public class salesByMatch {

    public static void main(String []args){

        int n=9;
        int [] ar = {10,20,20,10,10,30,50,10,20};
        ArrayList<Integer> index = new ArrayList<Integer>();

        for(int ii = 0; ii < n ; ii++){

            for(int jj = 0; jj < n ; jj++){
                if((ar[ii] == ar[jj]) && (jj != ii)){
                    if(!index.contains(ii) && !index.contains(jj)){
                        index.add(ii);
                        index.add(jj);
                    }
                }
            }

        }

        System.out.println(index.size()/2);

    }
}

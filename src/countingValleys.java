//https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
public class countingValleys {
    public static void main(String []args){

        int valley = 0;
        String path = "UDUDUUDDUDDU";
        int base = 0;
        for(int ii=0; ii < path.length(); ii++){
            if(path.charAt(ii) == 'U'){ base++; }
            else if(path.charAt(ii) == 'D'){ base--; }
            if(base == 0 && path.charAt(ii) == 'U'){ valley++; }
        }

        System.out.println(valley);
    }
}

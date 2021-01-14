import java.util.ArrayList;
import java.util.List;

public class ClimbingLeaderBoard {
    public static void main(String[] args) {
        List<Integer> ranked = new ArrayList<>();
        List<Integer> player = new ArrayList<>();
        ranked.add(100);ranked.add(100);ranked.add(50);ranked.add(40);ranked.add(40);ranked.add(20);ranked.add(10);
        player.add(5);player.add(25);player.add(50);player.add(120);

        List<Integer> rank = new ArrayList<>();
        while (true){
            int index = 0;
            if (player.size() > 0){
                int before = 0;
                int count = 0;
                for (Integer integer : ranked) {

                    if(integer > player.get(0)){

                        if(before == integer){

                        }else index++;

                        before = integer;
                    }else{
                        index++;
                       rank.add(index);
                        player.remove(0);
                        break;
                    }
                    count ++;
                }
                if(count == ranked.size()){
                    if (index == ranked.size()) {
                        rank.add(index);
                        player.remove(0);
                    }else{
                        index++;
                        rank.add(index);
                        player.remove(0);
                    }

                }
            }else break;
        }



        for (Integer integer : rank) {
            System.out.println(integer);
        }


    }
}

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> f = new ArrayList<>();
        ArrayList<Integer> s = new ArrayList<>();
        for (int i = 0; i < 50; i++){
        a.add(random.nextInt(1,100));

        if (a.get(i) % 2 == 0){

         f.add(a.get(i));
        } else if (a.get(i) %2 == 1) {
            s.add(a.get(i));
        }}
            System.out.println("Jup arraylist");
            for (int j = 0; j < f.size(); j++) {
                System.out.println(f.get(j));
            }
        System.out.println("Tak arraylist");
        for (Integer tak :
                s) {
            System.out.println(tak);
        }



    }
}
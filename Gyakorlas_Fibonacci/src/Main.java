import java.util.ArrayList;

public class Main {
    public static int fibo(int n){
        ArrayList<Integer> elemek = new ArrayList<Integer>();
        elemek.add(0);
        elemek.add(1);

        for (int i = 2; i <= n; i++) {
            elemek.add(elemek.get(i-1)+elemek.get(i-2));
        }

        return elemek.get(n);


    }
    public static void main(String[] args) {


        System.out.println(fibo(10));
        System.out.println(fibo(42));
    }
}
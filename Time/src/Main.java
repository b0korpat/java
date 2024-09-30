import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        while(true){
            LocalTime lc = new LocalTime.now();
            System.out.println(lc.withNano(0));
        }
    }
}
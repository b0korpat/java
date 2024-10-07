public class Main {
    public static void main(String[] args) {


        Auto a = new Auto(500,320, "piros", 4, 5);
        System.out.println("a = " + a);
        a.Dudal();
        
        Motor m = new Motor(200, 250, "kék", true);
        System.out.println("m = " + m);
        m.Dudal();

    }
}
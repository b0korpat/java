import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Auto auto = new Auto();
        ArrayList<Auto> autok = auto.AutokBetoltese("autok.csv");
        System.out.println("5. feladat: "+ autok.size() + " autó található a listában");
        double atlag = 0;
        for (Auto a : autok){
            atlag += a.getEladottDB();
        }
        atlag = atlag/autok.size();
        System.out.println("6. feladat: Az autók esetében az átlagosan eladott darabszám "+ String.format("%.1f", atlag));
        System.out.println("7. feladat: Az elmult 5 évben gyártott autók:");
        for (Auto a : autok){
            if(a.getGyEv() >= (date.getYear()-5)){
                System.out.println("-"+a.getMarka()+" "+a.getModell()+":"+a.getGyEv());
            }
        }
        System.out.println("8. feladat: Legsikeresebb márkák listája az eladott darabszám alapján:");
        HashMap<String, Integer> markaDB = new HashMap<>();
        for (Auto a : autok){
            if(markaDB.containsKey(a.getMarka())){
                markaDB.put(a.getMarka(), markaDB.get(a.getMarka())+a.getEladottDB());
            }
            markaDB.put(a.getMarka(), a.getEladottDB());
        }
        for (String i : markaDB.keySet()) {
            System.out.println(i + " - " + markaDB.get(i));
        }

    }
}

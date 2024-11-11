import java.io.File;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Telek telek = new Telek();
        ArrayList<Telek> telkek = telek.Betoltes("utca.txt");



        System.out.println("Telkek szama: "+ telkek.size());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Adószám? :");
        int adoszam = scanner.nextInt();

        for (Telek t : telkek){
            if (t.getTulajAdoSz() == adoszam) {
                System.out.println(t.getUtcaNev() + " " + t.getHazszam());
            }

        }


        int sumA = 0;
        int countA = 0;
        for (Telek t : telkek){
            if (t.getAdoSav() == 'A') {
                countA++;
                sumA = sumA+ t.Ado();
            }
        }
        System.out.println("A db:" + countA+ "db, össz adó "+ sumA+"Ft");


        int sumB = 0;
        int countB = 0;
        for (Telek t : telkek){
            if (t.getAdoSav() == 'B') {
                countB++;
                sumB = sumB+ t.Ado();
            }
        }
        System.out.println("B db:" + countB+ "db, össz adó "+ sumB+"Ft");


        int sumC = 0;
        int countC = 0;
        for (Telek t : telkek){
            if (t.getAdoSav() == 'C') {
                countC++;
                sumC = sumC+ t.Ado();
            }
        }
        System.out.println("C db:" + countC+ "db, össz adó "+ sumC+"Ft");






    }
}
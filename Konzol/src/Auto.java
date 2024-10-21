import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Auto {

    private int Sorszam;
    private String Marka;
    private String Modell;
    private int GyEv;
    private String Szin;
    private  int EladottDB;
    private int AtlagAr;

    public Auto(int sorszam, String marka, String modell, int gyEv, String szin, int eladottDB, int atlagAr) {
        Sorszam = sorszam;
        Marka = marka;
        Modell = modell;
        GyEv = gyEv;
        Szin = szin;
        EladottDB = eladottDB;
        AtlagAr = atlagAr;
    }
    public Auto() {
        Sorszam = 0;
        Marka = null;
        Modell = null;
        GyEv = 0;
        Szin = null;
        EladottDB = 0;
        AtlagAr = 0;
    }

    public ArrayList<Auto> AutokBetoltese(String filename){
        ArrayList<Auto> eredmeny = new ArrayList<Auto>();
        try {
            File textFile = new File(filename);
            Scanner scanner = new Scanner(textFile);

            while (scanner.hasNext()) {
                String sor = scanner.nextLine();
                if (!sor.contains("Sorszám")){
                    String[] oszlopok = sor.split(";");
                    Auto auto = new Auto(Integer.parseInt(oszlopok[0]),oszlopok[1],oszlopok[2],Integer.parseInt(oszlopok[3]),oszlopok[4],Integer.parseInt(oszlopok[5]),Integer.parseInt(oszlopok[6]));
                    eredmeny.add(auto);
                }
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Hiba tortent a fajl olvasasa kozben.");

        }
        return eredmeny;
    }

    public int getSorszam() {
        return Sorszam;
    }

    public void setSorszam(int sorszam) {
        Sorszam = sorszam;
    }

    public String getMarka() {
        return Marka;
    }

    public void setMarka(String marka) {
        Marka = marka;
    }

    public String getModell() {
        return Modell;
    }

    public void setModell(String modell) {
        Modell = modell;
    }

    public int getGyEv() {
        return GyEv;
    }

    public void setGyEv(int gyEv) {
        GyEv = gyEv;
    }

    public String getSzin() {
        return Szin;
    }

    public void setSzin(String szin) {
        Szin = szin;
    }

    public int getEladottDB() {
        return EladottDB;
    }

    public void setEladottDB(int eladottDB) {
        EladottDB = eladottDB;
    }

    public int getAtlagAr() {
        return AtlagAr;
    }

    public void setAtlagAr(int atlagAr) {
        AtlagAr = atlagAr;
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Telek {
    private int tulajAdoSz;
    private String utcaNev;
    private String hazszam;
    private char adoSav;
    private int epitmenyTerulet;

    public Telek(int tulajAdoSz, String utcaNev, String hazszam, char adoSav, int epitmenyTerulet) {
        this.tulajAdoSz = tulajAdoSz;
        this.utcaNev = utcaNev;
        this.hazszam = hazszam;
        this.adoSav = adoSav;
        this.epitmenyTerulet = epitmenyTerulet;
    }

    public Telek(){
        this.tulajAdoSz = 0;
        this.utcaNev = null;
        this.hazszam = null;
        this.adoSav = ' ';
        this.epitmenyTerulet = 0;
    }



    public ArrayList<Telek> Betoltes(String filename){
        ArrayList<Telek> eredmeny = new ArrayList<Telek>();
        try{
            File textFile = new File(filename);
            Scanner scanner = new Scanner(textFile);


           scanner.nextLine();
            while (scanner.hasNext()) {
                String sor = scanner.nextLine();
                String[] oszlopok = sor.split(" ");
                Telek telek = new Telek(Integer.parseInt(oszlopok[0]),oszlopok[1],oszlopok[2],oszlopok[3].charAt(0),Integer.parseInt(oszlopok[4]));
                eredmeny.add(telek);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return eredmeny;
    }

    public int Ado(){
        try{
            File textFile = new File("utca.txt");
            Scanner scanner = new Scanner(textFile);


            String sor = scanner.nextLine();
            String[] oszlopok = sor.split(" ");
            scanner.close();
            return switch (adoSav) {
                case 'A' -> Integer.parseInt(oszlopok[0]) * epitmenyTerulet;
                case 'B' -> Integer.parseInt(oszlopok[1]) * epitmenyTerulet;
                case 'C' -> Integer.parseInt(oszlopok[2]) * epitmenyTerulet;
                default -> 0;
            };

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public int getTulajAdoSz() {
        return tulajAdoSz;
    }

    public String getUtcaNev() {
        return utcaNev;
    }

    public String getHazszam() {
        return hazszam;
    }

    public char getAdoSav() {
        return adoSav;
    }

    public int getEpitmenyTerulet() {
        return epitmenyTerulet;
    }
}

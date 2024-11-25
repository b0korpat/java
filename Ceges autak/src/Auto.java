import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Auto {
    public Integer getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

    public String getLicencePlate() {
        return LicencePlate;
    }

    public Integer getIdNumber() {
        return IdNumber;
    }

    public Integer getKm() {
        return Km;
    }

    public Integer getParked() {
        return parked;
    }

    private Integer day;
    private String time;
    private String LicencePlate;
    private Integer IdNumber;
    private Integer Km;
    private Integer parked;

    public Auto(Integer day, String time, String licencePlate, Integer idNumber, Integer km, Integer parked) {
        this.day = day;
        this.time = time;
        LicencePlate = licencePlate;
        IdNumber = idNumber;
        Km = km;
        this.parked = parked;
    }

    public Auto() {
        this.day = 0;
        this.time = "";
        LicencePlate = "";
        IdNumber = 0;
        Km = 0;
        this.parked = 1;
    }

    public ArrayList<Auto> Betoltes(String filename){
        ArrayList<Auto> eredmeny = new ArrayList<Auto>();
        try{
            File textFile = new File(filename);
            Scanner scanner = new Scanner(textFile);


            scanner.nextLine();
            while (scanner.hasNext()) {
                String sor = scanner.nextLine();
                String[] oszlopok = sor.split(" ");
                Auto auto = new Auto(Integer.parseInt(oszlopok[0]),oszlopok[1],oszlopok[2],Integer.parseInt(oszlopok[3]),Integer.parseInt(oszlopok[4]), Integer.parseInt(oszlopok[5]));
                eredmeny.add(auto);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return eredmeny;
    }

}

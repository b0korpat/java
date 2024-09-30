public class Auto extends Jarmu
{
private int kerekekszama;
private int ajtokszama;

    public Auto(int loero, int vegsebesseg, String szin, int kerekekszama, int ajtokszama) {
        super(loero, vegsebesseg, szin);
        this.kerekekszama = kerekekszama;
        this.ajtokszama = ajtokszama;

    }



    @Override
    public String toString() {
        return "Auto{" +
                "ajtokszama=" + ajtokszama +
                ", loero=" + loero +
                ", vegsebesseg=" + vegsebesseg +
                ", szin='" + szin + '\'' +
                ", kerekekszama=" + kerekekszama +
                '}';
    }
}

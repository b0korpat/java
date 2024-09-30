public class Jarmu {
    private int loero;
    private int vegsebesseg;
    private String szin;

    public Jarmu(int loero, int vegsebesseg, String szin) {
        this.loero = loero;
        this.vegsebesseg = vegsebesseg;
        this.szin = szin;
    }

    public int getLoero() {
        return loero;
    }

    public int getVegsebesseg() {
        return vegsebesseg;
    }

    public String getSzin() {
        return szin;
    }

    public void Dudal(){
        System.out.println("Beep");
    }


}

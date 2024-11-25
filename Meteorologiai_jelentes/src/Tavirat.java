import java.util.ArrayList;

public class Tavirat {
    private String telepules;
    private String ido;
    private String szelIE;
    private int ho;


    public Tavirat(String telepules, String ido, String szelIE, int ho) {
        this.telepules = telepules;
        this.ido = ido.substring(0, 2) + ":" +ido.substring(2,4);
        this.szelIE = szelIE;
        this.ho = ho;
    }
    public Tavirat() {
        this.telepules = "";
        this.ido = "";
        this.szelIE = "";
        this.ho = 0;
    }

    public String getTelepules() {
        return telepules;
    }

    public String getIdo() {
        return ido;
    }

    public String getSzelIE() {
        return szelIE;
    }

    public int getHo() {
        return ho;
    }
}

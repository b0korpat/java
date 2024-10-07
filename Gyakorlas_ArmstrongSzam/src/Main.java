import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static boolean armstrong_szam(int n){
        String szam = Integer.toString(n);
        int[] szamok = new int[szam.length()];
        for (int i = 0; i < szam.length(); i++)
        {
            szamok[i] = szam.charAt(i) - '0';
        }

       double eredmeny = 0;
        for (Integer elem : szamok){
            eredmeny += Math.pow(elem,szam.length());
        }


        return eredmeny == (double) n;

    }

    public static void main(String[] args) {

        System.out.println(armstrong_szam(153));
        System.out.println(armstrong_szam(15312111));
        System.out.println(armstrong_szam(8208));



    }
}
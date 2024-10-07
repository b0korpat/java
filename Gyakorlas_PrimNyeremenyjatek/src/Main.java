import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg a csoki gyartasi sorszamat:");
        int szam = scanner.nextInt();
        boolean p = true;

        for (int i = 2; i < szam; i++) {
            if(szam % i == 0){
                p = false;
                break;
            }
        }
        if (p){
            System.out.println("Nyert");
        }else{
            System.out.println("Nem nyert");
        }



        }




    }

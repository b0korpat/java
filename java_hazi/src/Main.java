import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Összefűzés
        System.out.println("Az egyik szoveg: ");
        String txtStart = scanner.next();

        System.out.println("A masik szoveg: ");
        String txtEnd = scanner.next();

        System.out.println("A ket szoveg osszefuzve:");
        System.out.println(txtStart+txtEnd);

        //Áremelés
        System.out.println("Az alkatresz jelenlegi ara:");
        int partPrice = scanner.nextInt();

        System.out.println("Aremeles (szazalekban): ");
        double increase = scanner.nextDouble();

        int newPrice =  (int) (partPrice * (100 + increase) / 100.0);
        System.out.println("Az alkatresz uj ara:");
        System.out.println(newPrice);

        //Laci
        for (int i = 0; i < 100; i++) {
            System.out.println("Laci");
        }

        //Laci Kiegészítés
        System.out.println("Adjon meg egy szöveget");
        String txtOut = scanner.next();


        System.out.println("Hányszor írja ki:");
        int amount = scanner.nextInt();

        for (int i = 0; i < amount ; i++) {
            System.out.println(txtOut);
        }

        //Páros számok összege
        System.out.print("Add meg az alsó végpontot: ");
        int start = scanner.nextInt();

        System.out.print("Add meg a felső végpontot: ");
        int end = scanner.nextInt();

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        
        System.out.println("Az intervallumban található páros számok összege: " + sum);

    }
}
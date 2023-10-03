package ExerciseN4;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseN4 {

    public static void main(String[] args) {
        System.out.println("Inserisci un numero intero positivo (Es: 1,2,3 o anche 20)");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       int number = checkNumber(scanner);

                 if(number<0){
                     System.out.println("Ti ho chiesto un numero intero positivo :D");
        System.out.print("Riprova: ");
        number= checkNumber(scanner);
                 }

                 if(number >0){
                     for (int i = number; i >= 0; i--) {
                         System.out.println(i);
                         try {
                             Thread.sleep(1000);
                         } catch (InterruptedException e) {
                             System.out.println("Qualcosa è andato storto.");
                         }
                     }
                 }

        scanner.close();
    }


    private static int checkNumber(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Ti ho chiesto un numero intero positivo :D");
                System.out.print("Riprova: ");
            }
        }
    }
}

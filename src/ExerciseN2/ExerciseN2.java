package ExerciseN2;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseN2 {
    public static void main(String[] args) {
        System.out.println("Inserisci un numero intero (tipo 0,1,2 o 3).");
        Scanner scanner= new Scanner(System.in).useLocale(Locale.US);
        int number = getNextNumber(scanner);
        System.out.println(numberCheck(number,scanner));
    }

   private static String numberCheck(int number,Scanner scanner){
        switch (number){
            case (0):{
                return "zero";
            }
            case (1):{
                return "uno";
            }
            case (2):{
                return "due";
            }
            case (3):{
                return "tre";
            }
            default:{
                return "Riprova inserendo un numero intero valido che vada da 0 a 3.";
            }
        }
    }
    private static int getNextNumber(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Input non valido. Assicurati di inserire un numero intero valido da 0 a 3.");
                System.out.print("Riprova: ");
            }
        }
    }
}

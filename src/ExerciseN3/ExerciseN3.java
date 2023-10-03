package ExerciseN3;

import java.util.Scanner;

public class ExerciseN3 {

    public static void main(String[] args) {

        System.out.println("Inserisci una stringa!");

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        String splittedString ="";
        while(!string.equals(":q")) {
                for (int i = 0; i < string.length(); i++) {
                    if(i<string.length()-1){
                        splittedString +=  string.charAt(i)+(",") ;
                    }else{
                        splittedString +=  string.charAt(i) ;
                    }

                }
                System.out.println(splittedString);
            string = scanner.nextLine();
            splittedString = "";
        }
scanner.close();
    }
}

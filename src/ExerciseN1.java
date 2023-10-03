import java.lang.reflect.Array;

public class ExerciseN1 {
    public static void main(String[] args) {
        String[] stringArray = new String [5];
        stringArray[0]= "Ciao";
        stringArray[1]= "a";
        stringArray[2]= "tutti";
        stringArray[3]= "sono";
        stringArray[4]= "Raffaele";
        for (int i =0;i<=stringArray.length-1;i++){
            System.out.println(isItOddOrEven(stringArray[i]));
        }

        System.out.println("****** Esercizio 1.1 ******");

        int year = 1969;

        for(int i=0;i<=53;i++){
            System.out.println("L'anno " + ++year + " " + isItBisestileString(isItBisestile(year)));
        }
    }

    public static boolean isItOddOrEven(String string){
        if(string.length()%2==0){
            return true;
        }else{
            return false;
        }

    }

    public static boolean isItBisestile (int year){
        return  year%4==0? isItBisestileDoubleCheck(year):false;
    }

    public static boolean isItBisestileDoubleCheck(int year){
        return year%100==0?year%400==0?true:false:true;
    }

    public static String isItBisestileString(boolean bisestile){
        return bisestile? "è bisestile!":"non è bisestile!";
    }
}

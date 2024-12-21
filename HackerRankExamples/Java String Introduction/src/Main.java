import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {

    // The functions used are length(), charAt(), toUpperCase() and substring()

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.next();
        String secondString = scanner.next();

        int sumStringLength = firstString.length() + secondString.length();
        System.out.println(sumStringLength);

        int logicValueOfCompare = firstString.compareTo(secondString);

        if (logicValueOfCompare > 0) {
            System.out.println("Yes");
        }
        if (logicValueOfCompare <= 0) {
            System.out.println("No");
        }

        String mergedTwoString = capitalizFirstLatter(firstString) + " " + capitalizFirstLatter(secondString);

        System.out.println(mergedTwoString);

    }


    public static String capitalizFirstLatter(String enteredString){
        // will store 'H'
        char newWordFirstLatter = enteredString.toUpperCase().charAt(0);

        // "H" + "ello"
        String newWord = newWordFirstLatter + enteredString.substring(1, enteredString.length());


        return newWord;
    }
}
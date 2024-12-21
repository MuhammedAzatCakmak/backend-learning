import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        String B = "";
        for(int i = 0; i < A.length(); i++){
            B = B + A.charAt(A.length() - i - 1);
        }

        if(A.equals(B)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


    }
}




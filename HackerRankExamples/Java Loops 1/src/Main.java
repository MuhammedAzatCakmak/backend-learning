import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 2 && n <= 20) {
            for(int i = 1; i <= 10; i++){
                System.out.println(n + " x " + i + " = " + n*i);
            }
        }

    }
}

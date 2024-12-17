import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= -100 && n <= 100 ) {
            try{
                String s = Integer.toString(n);
                System.out.println("Good job");
            }catch(Exception e){
                System.out.println("Wrong answer");
            }

        }
    }
}

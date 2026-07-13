
//Guvi code kata
import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int count = 0;

        int N = obj.nextInt();

        for(int i = 1; i <= N; i++) {

            if(N % i == 0) {
                count++;
            }
        }

        if(count == 2) {
            System.out.print("yes");
        }
        else {
            System.out.print("no");
        }

        obj.close();
    }
}
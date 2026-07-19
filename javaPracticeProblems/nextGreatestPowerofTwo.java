import java.util.Scanner;
public class nextGreatestPowerofTwo {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int power = 2;   // starts from 2^1
        while(power<=N){
            power *= 2;
        }
                    System.out.print(power);

    }
}
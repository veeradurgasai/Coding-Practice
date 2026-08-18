import java.util.Scanner;

public class Nearestgreatermultipleof10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int ans = ((n / 10) + 1) * 10;
        
        System.out.print(ans);
    }
}
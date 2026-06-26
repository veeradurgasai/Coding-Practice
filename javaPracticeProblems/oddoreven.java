//Guvi code kata
import java.util.*;
class oddoreven{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if((N+M)%2 == 0){
            System.out.print("even");
            
        }
        else{
            System.out.print("odd");
        }
        
    }
}
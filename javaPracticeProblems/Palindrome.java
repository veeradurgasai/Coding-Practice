import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        String S = obj.next();
        String O = S;
        String rev = "";
        for(int i=S.length()-1;i>=0;i--){
            rev = rev+S.charAt(i);
            
        }
        if(O.equals(rev)){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
        
    }
}
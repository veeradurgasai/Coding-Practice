import java.util.*;
class Vowel{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        boolean found= false;
        for(int i = 0;i<S.length();i++){
            char k = S.charAt(i);
            if(k == 'a'|| k == 'e'|| k=='i'||k=='o'||k=='u'){
                found = true;
                break;
            }
        }
        if(found){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}
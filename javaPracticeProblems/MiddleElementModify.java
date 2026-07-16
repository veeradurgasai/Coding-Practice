import java.util.Scanner;

public class MiddleElementModify{
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        String S = obj.next();

        StringBuilder sb = new StringBuilder(S);

        char k = '*';

        int j = S.length() / 2;

        if(S.length() % 2 == 0) {

            sb.setCharAt(j, k);
            sb.setCharAt(j - 1, k);

        }
        else {

            sb.setCharAt(j, k);

        }

        System.out.print(sb);

        obj.close();
    }
}
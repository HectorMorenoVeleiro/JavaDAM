package tres;

import java.util.Scanner;

public class Propuesto8 {

    /* 1000M 500D 100C */
    public static void main(String[] args) {
        String res = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("INTRODUCE UN NUMERO DEL 1 AL 3999 --> ");
        int n = Integer.parseInt(sc.nextLine());

        while (n > 0) {
            while (n >= 1000) {
                res += "M";
                n -= 1000;
            }
            while (n >= 500) {
                res += "D";
                n -= 500;
            }
        }
        System.out.println(res);
    }

}

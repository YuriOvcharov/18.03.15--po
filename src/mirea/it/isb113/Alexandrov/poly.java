package mirea.it.isb113.Alexandrov;

import java.util.Scanner;

/**
 * Created by student on 18.03.2015.
 */
public class poly {
    public static boolean isPoly(String string) {
        boolean poly=true;
        for (int i = 0; i < string.length()-1; i++) {
            if (string.charAt(i)!=string.charAt(string.length()-i-1)) {
                poly=false; break;

            }
        }
        return poly;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        if (isPoly(string)) {
            System.out.println("POLY!");

        } else {
            System.out.println("NOT POLY! =(");
        }

    }

}

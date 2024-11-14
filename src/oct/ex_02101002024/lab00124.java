package oct.ex_02101002024;

import java.io.FileInputStream;

public class lab00124 {
    public static void main(String[] args) {
        int c = 0;
        try {
            c = 10 / c;
            String s1 = null;
            s1.trim();
            System.out.println(c);
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e);
        }
        System.out.println("End");


    }
}
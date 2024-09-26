package sep.ex_0180902024;

public class lab0025 {
    public static void main(String[] args) {
        // type casting
        // widening - implicit , explicit, Explicit - lossless
        //narrowing - implicit, explicit ( with data type),loss

        //widening
        byte b = 10;
        int a = b; // valid implicit jvm
        int al = (int)b; // valid explicit casting jvm

        // narrowing
        int val = 300;
       // byte b1 =/ val; //invalid implicit jvm
        byte b2 = (byte)val; //invalid explicit casting - loss of data
        System.out.println(b2);

    }
}

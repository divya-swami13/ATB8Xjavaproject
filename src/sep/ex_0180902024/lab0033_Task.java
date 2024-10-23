package sep.ex_0180902024;

public class lab0033_Task {
    public static void main(String[] args) {
    byte b = 10;
    int a = b;
    // valid implicit casting - jvm
        int val = 200;
        // byte b1 = val; // invalid implicit casting-jvm
        byte b2 = (byte)val;// invalid explicit casting - loss of data
        System.out.println(b2);

    }
}

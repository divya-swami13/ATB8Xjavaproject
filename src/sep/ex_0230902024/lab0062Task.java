package sep.ex_0230902024;

public class lab0062Task {
    public static void main(String[] args) {
        int value = 20;
        int result;
        int conversion = 1;
        switch (conversion){
            case 1:
                result = (int)(value/ 1.6);
                System.out.println("conversion from kilometer to miles is "+ result);
                break;
            case 2:
                result = ((value*9)/5)+32;
                System.out.println("conversion from celcius to FH is " + result);
                break;
            default :
                System.out.println("invalid input");
                break;
        }
    }
}

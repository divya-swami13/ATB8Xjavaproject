package sep.ex_0230902024;

public class lab0060Task {
    public static void main(String[] args) {
        int a = 10;
        int b= 20;
        char operation = '*';
        switch(operation) {
            case '*':
                System.out.println(a * b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '+':
                System.out.println(a + b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case'%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("invalid input");


        }
    }
}

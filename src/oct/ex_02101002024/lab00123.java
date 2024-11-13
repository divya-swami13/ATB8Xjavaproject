package oct.ex_02101002024;

public class lab00123 {
    public static void main(String[] args) {
        String ip = args[0];
        int a = Integer.parseInt(ip);
        int b= 1000/a;
        System.out.println(b);
        System.out.println(" End of the program ");

        //jvm will be initialization (from RAM)
        // create and starts main thread.-- main called
        // collect the command line arguments - 10
        // String[] args - {10}
        // lab00122_Exception.main()
        // when problem comes in main
        // if you don't handle the exception jvm will handle it
        // always terminate the program
    }
}

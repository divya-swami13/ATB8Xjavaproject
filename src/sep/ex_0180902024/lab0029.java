package sep.ex_0180902024;

public class lab0029 {
    public static void main(String[] args) {
        // practice of pre and post - Increment
        // pre - increment
         int a = 10;
         System.out.println(++a);

     //   post - increment
        int c_post = 54;
        System.out.println(c_post++);
        System.out.println(c_post);


        int b = 10;
        System.out.println(b++  + b);

        int c = 10;
        System.out.println( c++ + ++c);
        System.out.println(c);

        int e = 10;
        System.out.println(++e + ++e);
        System.out.println(e);

        int f = 10;
        System.out.println(++f + f++ + f++);
        System.out.println(f);
    }

}

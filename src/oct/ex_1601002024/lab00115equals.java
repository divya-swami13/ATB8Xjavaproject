package oct.ex_1601002024;

public class lab00115equals {
    public static void main(String[] args) {
        String s1 = " Hello";
        String s4 = " Hello";
        String s2 =  new String(" Hello");
        String s3 = new String(" Hello");
        String s5 = " hello";
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s4);
        // == this is checking ref location

        //how can I check the values? equals == value
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));
    }

}
package oct.ex_01801002024;

import java.util.Locale;

public class lab00116function {
    public static void main(String[] args) {
        String str = "Hello world";
        // length of the string
        System.out.println("length: " + str.length());

        String s1 = " divya ";
        System.out.println("length:"+ s1.length());

        //substring
        System.out.println("substring:"+s1.substring(1, 3));

        //Trim
        System.out.println("Trimmmed:" + str.trim()+"'");

        // convert to uppercase
        System.out.println("uppercase:"+ str.toUpperCase());
        System.out.println("lowercase:"+ str.toLowerCase());

        System.out.println(str.charAt(2));
        System.out.println(str.equals("Hello"));
        System.out.println(str.indexOf("H"));
        System.out.println(str.contains("L"));
        System.out.println(str.isEmpty());
        System.out.println(str.split(" "));
        String name1 = "divya";
        String name2 = "divya";
        System.out.println(name1.compareTo(name2));

        // compareTO  -> 0 - both of them are same
        // return number -> ASCII value diff - between the String
        // d -> D- lexicographically compression
String name = " pramod ";
        System.out.println(name.strip());

    }
}

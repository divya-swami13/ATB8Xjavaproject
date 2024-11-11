package oct.ex_1401002024;


import org.w3c.dom.ls.LSOutput;

public class lab00108_static {
    public static void main(String[] args) {
        Student s1 = new Student(23);
        Student s2 = new Student( 33 );
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(Student.school_name);
        Student.school_name= "XYZ";
        System.out.println(Student.school_name);

    }
}
class Student {
    int age;
    static String school_name = "ABC";


    {
        System.out.println("IIB");
        System.out.println("Here you can write a code what you want to do when object is created ");
        System.out.println("read a MySQL db");
    }
     static{
         System.out.println("SIB");
     }

    public Student(int age) {
        this.age = age;

    }


}
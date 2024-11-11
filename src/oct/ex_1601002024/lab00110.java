package oct.ex_1601002024;

import java.sql.SQLOutput;

public class lab00110 {
    public static void main(String[] args) {
        ATB s1 = new ATB("Amit");
        ATB s2 = new ATB("suraj");
        ATB s3;
        new ATB("pramod");

        s1.ReadDocument();
        s2.ReadDocument();

        ATB.doAssignment();

    }
}

class ATB{
    {
        System.out.println("IIB");
        System.out.println("reading from CSV files");
    }
    static{
        System.out.println("SIB");
        System.out.println("load the class?, i will execute");
    }

    public ATB(String name) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String phone;
    private String CourseName = "ATB8x";

     void ReadDocument(){
         System.out.println("Non static method");
     }
     static void doAssignment(){
         System.out.println("do assignment");
     }
}
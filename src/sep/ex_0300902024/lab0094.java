package sep.ex_0300902024;

public class lab0094 {
    public static void main(String[] args) {


// 1. Without parameter and without return type
       function_type1();
// 2. without parameter but with return type
        String name = function_type2();
        System.out.println(name);
        int age = function_type();
        System.out.println(age);
// 3. With parameter and without return type
        function_type3(name= "Amit");
// 4. with parameter and with return type
        int result= function_type4(4,3);
        System.out.println(result);
    }
public static void function_type1(){
    System.out.println("1. Without parameters and without return type");
}
    public static String function_type2(){
        System.out.println("2. Without parameter but with return type");
        return "pramod";
    }
    public static int function_type(){
        System.out.println(" without parameter but with return type");
        return  24;
    }
    public static void function_type3(String name){
        System.out.println("3. with parameter and without return type");
        System.out.println("you hav shared -> " + name);
    }
    static int function_type4(int a,int b){
        System.out.println("4. with parameter and with return type");
        return a+b;
    }
}

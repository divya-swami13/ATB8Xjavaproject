package sep.ex_0180902024;

public class lab0026 {
    public static void main(String[] args) {
        long phone_no = 1236547890l;
        //short  s = phone no; //narrowing implicit - jvm
        short s1 = (short)phone_no; //narrowing explicit -loss // invalid

        // EX--->
      //  GST= 18.45;
        int course = 100;
        float GST = 18.45f;
        // int total price - course+GST;// narrowing implicit jvm invalid
       // float total_ price -course + GST;//narrowing - implicit jvm invalid

        int total_price = course+(int)GST; // narrowing - explicit -loss
        System.out.println(total_price);
    }
}

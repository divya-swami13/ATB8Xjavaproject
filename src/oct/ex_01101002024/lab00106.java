package oct.ex_01101002024;

public class lab00106 {
    public void main(String[] args) {
        P p = new P();
        p.f1();

       // I i = new i();


    }
    class P implements I{

        @Override
        public void f1() {

        }

        @Override
        public void f2() {

        }

        @Override
        public void f3() {

        }
    }
    interface I{
        void f1();
        void f2();
        void  f3();
    }
}

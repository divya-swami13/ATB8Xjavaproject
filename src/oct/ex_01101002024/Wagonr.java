package oct.ex_01101002024;


public class Wagonr extends engine{

    void drive(){
        startEngine();
        stopEngine();
    }

    @Override
    void startEngine() {
        System.out.println("starting car");
    }

    @Override
    void stopEngine() {
        System.out.println("stopping car");
    }
}

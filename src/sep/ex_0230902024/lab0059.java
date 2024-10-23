package sep.ex_0230902024;


public class lab0059 {
    public static void main(String[] args) {

        int itemCode = 006;
        switch (itemCode){
            case 001, 002, 005:
                System.out.println("all of the them are Electronic Gadget");
                break;
            case 004, 006, 007:
                System.out.println("this is mech");
                break;
            default:
                System.out.println("None");
                break;
        }


        }

    }


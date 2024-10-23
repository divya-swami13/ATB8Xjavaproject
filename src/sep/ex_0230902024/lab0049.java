package sep.ex_0230902024;

public class lab0049 {
    public static void main(String[] args) {
        // switch condition
        // days - 1 to 7
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thur");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
            default:
                System.out.println("no idea, what day its");
                break;
        }
        System.out.println("end of the loop");


        }
    }


package sep.ex_0230902024;



public class lab0061Task {
    public static void main(String[] args) {
        int month = 5;
        switch(month){
            case 1 -> System.out.println("jan");
            case 2 -> System.out.println("feb");
            case 3 -> System.out.println("mar");
            case 4 -> System.out.println("apr");
            case 5 -> System.out.println("may");
            case 6 -> System.out.println("jun");
            case 7 -> System.out.println("jul");
            case 8 -> System.out.println("aug");
            case 9 -> System.out.println("sep");
            case 10 -> System.out.println("oct");
            case 11 -> System.out.println("nov");
            case 12 -> System.out.println("dec");
            default -> System.out.println("invalid input");
        }
    }
}

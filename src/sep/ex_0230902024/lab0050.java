package sep.ex_0230902024;



public class lab0050 {
    public static void main(String[] args) {
        // Web Automation
        // i will ask user which browser you want me to run the code.
        //chrome -> execute chrome
        // firefox - > execute of firefox
        // edge -> edge cases

        String browser = "chrome";
        switch (browser) {
            case "chrome":
                System.out.println("starting the chrome browser");
                break;
            case "firefox":
                System.out.println("starting the firefox browser");
                break;
            case "edge":
                System.out.println("execute the edge code");
                break;
            default:
                System.out.println("i have not idea which browser is this");
                break;

        }
    }
}

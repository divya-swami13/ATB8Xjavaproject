package oct.ex_1601002024;


public class lsb000113 {
    public static void main(String[] args) {
        System.out.println(APIConstantsENDpoints.BASE_URL.getValue());
    }
}

// store APIconstants-ENDpoint
enum APIConstantsENDpoints{

    BASE_URL( "http://app.vwo.com"),
    LOGIN_URL("https://app.vwo.com/login"),
    DASHBOARD_PAGE("https://app.vwo.com/dasHboard"),
    CHATBOT_PAGE("htttps://app.vwo.com/chat");
    private String name;
    APIConstantsENDpoints(String name){
        this.name = name;
    }
    String getValue(){
        return name;
    }

    }

package oct.ex_1601002024;

public class lab00112 {
    public static void main(String[] args) {
        System.out.println(colour.RED.getHexcode());
        System.out.println(colour.GREEN.getHexcode());

        if (colour.GREEN.getHexcode() == "#61FF33"){
            System.out.println("colour is Green");
        }
    }
}
enum colour{
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF");

    private String hexcode;

    private colour(String hexcode){
        this.hexcode = hexcode;
    }
    public String getHexcode(){
        return this.hexcode;
    }
}
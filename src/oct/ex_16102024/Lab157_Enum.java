package oct.ex_16102024;

public class Lab157_Enum {

    public static void main(String[] args) {
        System.out.println(Color.RED.getHexcode());
        System.out.println(Color.GREEN.getHexcode());

        if (Color.GREEN.getHexcode() == "#61FF33") {
            System.out.println("Color is Green");
        }
    }

}

enum Color {
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    String hexcode;

    Color(String hexcode) {
        this.hexcode = hexcode;
    }

    String getHexcode() {
        return this.hexcode;
    }


}
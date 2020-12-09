package util;

public class InputTest {

    public static void main(String[] args) {
        Input text = new Input();
        text.getString();
        System.out.println(text.yesNo());

        text.getInt(1, 10);

        text.getDouble(1.0, 10.0);



    }
}

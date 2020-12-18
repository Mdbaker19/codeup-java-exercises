package util;

public class InputTest {

    public static void main(String[] args) {
        Input text = new Input();
//        text.getString();
//        text.getString("hello");
//        System.out.println(text.yesNo());
//        text.getDouble(1.0, 10.0);
//        text.getInt(1, 10);



        System.out.println("new input test try catch");
        System.out.println(text.getInt());

        System.out.println("new input double test try catch");
        System.out.println(text.getDouble());

        System.out.println("binary test");
        System.out.println(text.getBinary());

    }
}

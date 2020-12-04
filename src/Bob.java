import java.util.Scanner;

public class Bob {

    public static  String response(String q){
        if(q.equals("")){
            return "Fine. Be that way!";
        } else if(q.endsWith("!")){
            return "Whoa, chill out!";
        } else if(q.endsWith("?")){
            return "Sure";
        }
        return "Whatever";
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean wantToAsk;
        do {
            System.out.println("My name is Bob and i can do many things. Ask me a question");
            String forBob = sc.nextLine();
            System.out.println(response(forBob));
            System.out.println("Would you like to ask again??? [Y]es, [N]o");
            String goAgain = sc.next();
            sc.nextLine();
            wantToAsk = (goAgain.equalsIgnoreCase("Y"));
        }while(wantToAsk);
    }
}
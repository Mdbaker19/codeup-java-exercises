import java.util.Scanner;

public class StringBonus1 {

    public static String getDate(String date){
        String[] months = {"Jan", "Feb", "Mar", "April", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int month = Integer.parseInt(date.substring(0, 2));
        String day = date.substring(3, 5);
        String year = date.substring(6, date.length() - 1);
        String outputMonth = months[month-1];
        return outputMonth + "/" + day + "/" + year;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date as MM/DD/YYYY");
        String inputDate = sc.next();
        System.out.println(getDate(inputDate));
    }
}

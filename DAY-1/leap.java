import java.util.Scanner;


public class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int a = sc.nextInt();
	 System.out.println("is leap year"+( (a%4==0 && a%100!=0) || (a%400==0)));
     sc.close();
    }
}

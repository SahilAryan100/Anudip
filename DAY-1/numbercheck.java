import java.util.Scanner;

public class numbercheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        // using nestedd ternary operator
        String res = (num > 0)? "positive":(num<0 ? "negative" : "zero");
        System.out.println(num+ "this is" +res);
        sc.close();
    }
}

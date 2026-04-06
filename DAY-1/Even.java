import java.util.*;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int n = sc.nextInt();

        String  res = (n%2==0)? "even": (n%2!=0 ? "odd" : "error");
        System.out.println(n+ "your number is " +res);
        sc.close();
    }
}

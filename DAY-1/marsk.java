import java.util.*;

public class marsk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int mark = sc.nextInt();

        String res = (mark>=33)? "pass" : (mark<33 ? "fail" : "not a valid input");
        System.out.println(mark+ "you are" +res);
        sc.close();
    }
}

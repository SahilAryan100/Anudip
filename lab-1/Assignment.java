import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int max = (num1 > num2) ? num1 : num2;

        System.out.println("The maximum between " + num1 + " and " + num2 + " is: " + max);
        sc.close();
    }
}
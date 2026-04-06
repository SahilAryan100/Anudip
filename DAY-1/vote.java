import java.util.Scanner;


public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the age");		
int age = sc.nextInt();

boolean res = (age>=18);
System.out.println(age+ "is eligible" +res);
sc.close();
    }
}

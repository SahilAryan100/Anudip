import java.util.Scanner;

public class lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter alphabet");
char alp = sc.next().charAt(0);
String cas = (alp>=65 && alp<=90)?
"uppercase" : (alp>=97 && alp<=122)? "lowercase" : "not a letter";
System.out.print(alp + cas);
sc.close();
    }
}

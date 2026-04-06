import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yourn alphabet");
        char alp = sc.next().charAt(0);
        boolean res =  alp=='a'|| alp=='e'||alp=='i'||alp=='o'||alp=='u';
        System.out.println(alp+ "alphabet is: " +res);
sc.close();
    }
}

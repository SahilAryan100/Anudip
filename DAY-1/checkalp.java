import java.util.Scanner;

public class checkalp {
    public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch=sc.next().charAt(0);
		
		boolean c1 = (ch>='A' && ch<='Z')||(ch>='a' && ch<='z');
		//             
		boolean c2 = (ch>='A' && ch<='Z');
		
		char ch1 = (char) (ch+32);
		System.out.println("ch1 : "+ch1);
		// check vowel
	boolean c3 =  ch1=='a'|| ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u';
	
		
	// 	char ch1= (ch>='A' && ch<='Z')||(ch>='a' && ch<='z')?
	// 			(ch>='A' && ch<='Z')?(char) (ch+32):ch:ch;
		
	// 	System.out.println(ch1=='a'|| ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'?
	// 			ch+" is a vowel": ch+" is not a vowel");
	// }
}
}

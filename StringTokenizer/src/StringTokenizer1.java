import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenizer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter string : ");
		String str = scan.nextLine();
		System.out.println("Constructor1 : ");
		StringTokenizer S = new StringTokenizer(str, " ");
		while(S.hasMoreTokens()) {
			System.out.println(S.nextToken());
		}
		
		
		System.out.println("\nConstructor2 : ");
		System.out.println("Enter string : ");
		str = scan.nextLine();
		StringTokenizer S1 = new StringTokenizer(str, ":");
		while(S1.hasMoreTokens()) {
			System.out.println(S1.nextToken());
		}
		
		
		System.out.println("\nConstructor3 : ");
		System.out.println("Enter string : ");
		str = scan.nextLine();
		StringTokenizer S2 = new StringTokenizer(str, ":",true);
		while(S2.hasMoreTokens()) {
			System.out.println(S2.nextToken());
		}
		
	}

}

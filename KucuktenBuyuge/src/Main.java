import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.println("a say�s�n� giriniz: ");
		a= input.nextInt();
		
		System.out.println("b say�s�n� giriniz: ");
		b=input.nextInt();
		
		System.out.println("c say�s�n� giriniz: ");
		c=input.nextInt();
		
		if ((a<b) && (a<c)) { 
			if (b<c) {
			System.out.println("a<b<c");
			}
			else {
				System.out.println("a<c<b");
			}
		}
		else if ((b<a) && (b<c)) {
			if (a<c) {
				System.out.println("b<a<c");
			}	
			else {
				System.out.println("b<c<a");
			}
		}
		else if ((c<b) && (c<a)) {
			if (b<a) {
				System.out.println("c<b<a");
			}
			else {
				System.out.println("c<a<b");
			}
		}
	}
}

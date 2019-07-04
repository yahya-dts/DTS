import java.util.*;

public class algo4
{
	public static void main(String[] args) 
	{
		
	Scanner input = new Scanner(System.in);
	int a,b;
		System.out.println("Bilangan 1 : ");
		a = input.nextInt();
		System.out.println("Bilangan 2 : ");
		b = input.nextInt();
	if (a==b) {
		System.out.println("Sama !");
	}
	else if (a>b) {
		System.out.println("Lebih Besar dari Bilangan 1 !");
	}
	else if (a<b) {
		System.out.println("Lebih Besar dari Bilangan 2 !");
	}
	}
}
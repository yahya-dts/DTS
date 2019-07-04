import java.util.*;

public class algo3
{
	public static void main(String[] args) 
	{
		
	Scanner input = new Scanner(System.in);
	int a;
	double b,kel,luas;
		System.out.println("Masukkan jari-jari : ");
		a = input.nextInt();
	b = 3.14;
	kel = 2*b*a;
	luas = b*a*a;
	System.out.println("Keling Lingkaran : "+ kel);
	System.out.println("Luas Lingkaran : "+ luas);
}

}
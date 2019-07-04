import java.util.*;

public class algo1
{
	public static void main(String[] args) 
	{
		
	Scanner input = new Scanner(System.in);
	int a,x,y;
		System.out.println("Masukkan angka : ");
		a = input.nextInt();
	x=1;
	y=x*x;	
	while (y != a) {
		x=x+1;
		y=x*x;
	}
	System.out.println("Akar : "+ x);
}

}
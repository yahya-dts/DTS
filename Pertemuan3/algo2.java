import java.util.*;

public class algo2
{
	public static void main(String[] args) 
	{
		
	Scanner input = new Scanner(System.in);
	int a;
		System.out.println("Masukkan angka sembarangan : ");
		a = input.nextInt();

	if (a%2 == 0) {
		System.out.println("Genap");
		}	
	else {
		System.out.println("Ganjil");
	}
}

}
package secondSem;
import java.util.Scanner;
public class DecimalToHexa {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scn.nextInt();
		int a[]=new int[20];
		int i=0;
		while(n>0)
		{
			a[i]=n%16;
			n=n/16;
			i++;
		}
		for(int j=i-1;j>=0;j--)
		{
			if(a[j]>9)
			{
				print(a[j]);
			}
			else 
				System.out.print(a[j]);
		}
	}
	static void print(int n)
	{
		switch(n)
		{
		case 10:
			System.out.print("A");
			break;
		case 11:
			System.out.print("B");
			break;
		case 12:
		System.out.print("C");
		break;

		case 13:
			System.out.print("D");
			break;

		case 14:
			System.out.print("E");
			break;

		case 15:
			System.out.print("F");
			break;

	
		}
	}
}

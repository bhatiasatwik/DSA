package recursiom;
import java.util.*;
public class Input {
	
	static int[] takeInput()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size");
		int n=scn.nextInt();
		int a[] =new int[n];
		System.out.println("Enter the elem");
		for(int i=0;i<n;i++)
		{
			a[i]=scn.nextInt();
		}
		return a;
		
		
	}

}

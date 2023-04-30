package secondSem;
import java.util.*;
public class ToggleBulb {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the number of bulbs");
	int n=scn.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=-1;
	}
	for(int i=0;i<n;i++)
	{
		for(int j=i;j<n;j=j+i+1)
		{
			a[j]=a[j]*-1;
		}
	
	}
	int c=0;
	for(int i=0;i<n;i++)
	{
		if(a[i]==1)
			c++;
		else if(a[i]==999)
		{
			System.out.println(".");
		}
	}
	System.out.println(c);
}
}

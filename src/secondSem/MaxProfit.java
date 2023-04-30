package secondSem;
import java.util.*;

public class MaxProfit {
	public static void main(String[] args) {
		int a[]= {61,65,97,90,99};
		Arrays.sort(a);
		double sum=0;
		int j=0;
		int fp=0,p=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		sum=sum/a.length;
		for(j=0;j<a.length;j++)
		{
			if(a[j]>sum)
				{fp=a[j];
			break;	
				}
		}
		p=(-j+a.length)*fp;
		System.out.println(fp);
		System.out.println(p);
			
		
	}

}

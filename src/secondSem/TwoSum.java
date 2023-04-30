package secondSem;
import java.util.*;
public class TwoSum {

	public static void main(String[] args) {
		
		int a[] ={13,7,2,11};
		Arrays.sort(a);
		int t=9;
		int s=0;
		int l=a.length-1;
		while(s<l)
		{
			if(a[s]+a[l]==t)
			{
				System.out.println(a[s]+" "+a[l]);
				s++;
				l--;
			}
			else if(a[s]+a[l]>t)
			{
				l--;
			}
			else 
				s++;
		}
		

	}

}

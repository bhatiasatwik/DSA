package Babbar450;

public class questions {
	
	static void ques2(int a[])
	{
		int l=a.length;
		int max=0,min=0;
		int ind=1;
		if(l%2!=0)
		{
			min=max=a[0];
		}
		else
		{
			max=(a[0]>a[1])?a[0]:a[1];
			min=(a[0]<a[1])?a[0]:a[1];
			ind++;
		}
		for(int i=ind;i<l-1;i++)
		{
			if(a[i]>a[i+1])
			{
				if(a[i]>max)
					max=a[i];
				if(a[i+1]<min)
					min=a[i+1];
			}
			else
				if(a[i+1]>max)
				{
					max=a[i+1];
				}
				if(a[i]<min)
				{
					min=a[i];
				}
		}
		System.out.println("MAX IS "+max+"MIN IS "+min);
	}
	//------------------------------------------------------------------------
}

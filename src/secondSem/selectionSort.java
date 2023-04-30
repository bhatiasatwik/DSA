package secondSem;

public class selectionSort {
	public static void main(String[] args) {
		int a[]= {2,5,10,11};
		int n=a.length;
		int t=0;
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[min]>a[j])
					min=j;
			}
			t=a[min];
			a[min]=a[i];
			a[i]=t;
		}
	for(int i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}

	}	
}

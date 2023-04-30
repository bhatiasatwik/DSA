package secondSem;

public class BubbleSort {
	public static void main(String[] args) {
		int a[]= {10,2,55,100,0};
		int n=a.length;
		int t=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
		}
	}
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
}

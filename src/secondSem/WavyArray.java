package secondSem;

public class WavyArray {
	public static void main(String[] args) {
		int a[]= {2,6};
		int i=0;
		int j=1;
		int t;
		while(j<a.length)
		{
			t=a[i];
			a[i]=a[j];
			a[j]=t;
			i+=2;
			j+=2;
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
	  }
}

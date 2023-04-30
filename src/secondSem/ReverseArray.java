package secondSem;

public class ReverseArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int m=4;
		int s=m;
		int t=0;
		int e=a.length-1;
		while(s<e)
		{
			t=a[s];
			a[s]=a[e];
			a[e]=t;
			s++;
			e--;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}

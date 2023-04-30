package secondSem;

public class FirstIndex {
	public static void main(String[] args) {
		int si=0;
		int n=2;
		int a[]= {1,2,3,4,2,1,3,5};
		System.out.println(first(a,si,n));		
	}
	public static int  first(int b[],int si,int n)
	{
		if(si==b.length)
			return -1;
		if(b[si]==n)
			return si;
	return 	first(b,si+1,n);
		
	}

}

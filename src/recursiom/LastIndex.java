package recursiom;

public class LastIndex {

	public static void main(String[] args) {
		int a[] =Input.takeInput();
		System.out.println(first(a,0,3));
	}
	static int first(int a[],int n,int v)
	{
		if(n==a.length)
			return -1;
		int sa=first(a, n+1, v);
		if(sa!=-1)
			return sa;
		if(a[n]==v)
			return n;
		return -1;
	
		
	}

}



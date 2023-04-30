package recursiom;

public class PrintArray {
	public static void main(String[] args) {
		int a[] =Input.takeInput();
		print(a,0);
		revprint(a,0);
	}
	static void print(int a[],int n)
	{
		if(n==a.length)
			return;
		System.out.println(a[n]);
		print(a,n+1);
	}
	
	
	static void revprint(int a[],int n)
	{
		if(n==a.length)
			return;
		revprint(a,n+1);
		System.out.println(a[n]);
	}
}
	

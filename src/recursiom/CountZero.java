package recursiom;

public class CountZero {
	public static void main(String[] args) {
		int n=00;
		System.out.println(count(n));
	}
	static int count(int n)
	{
		if(n==0)
			return 0;
		int sa=count(n/10);
		if(n%10==0)
			return ++sa;
		else
			return sa;
	}

}

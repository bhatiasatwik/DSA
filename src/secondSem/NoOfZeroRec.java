package secondSem;

public class NoOfZeroRec {

	public static void main(String[] args) {
	int n=100050;
	System.out.println(zero(n));
	}
	
	static int zero(int n)
	{
		if(n/10==0)
			return 0;
		int sa=zero(n/10);
		if(n%10==0)
			return ++sa;
		else 
			return sa;
	}

}

package recursiom;

public class stepsReduce {

	public static void main(String[] args) {
		System.out.println(reduce(10));
	}
	static int reduce(int n)
	{
		int sa=0;
		if(n==1)
			return 0;
		if(n<1)
			return 0;
		if(n%2==0)
			 sa=reduce(n/2);
		else
			 sa=reduce(n-1);
		return 1+sa;
	}

}

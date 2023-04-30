package recursiom;

public class TowrOfHanoi {
	public static void main(String[] args) {
		toh(2 , 's','h','d');
	}
	static void toh(int n , char s, char h , char d)
	{
		if(n==1)
			System.out.println("Move the disk from "+s+" to "+d);
		else 
		{
			toh(n-1,s,d,h);
			System.out.println("move the "+n+"disk from "+s+" to"+d);
			toh(n-1,h,s,d);
		}
	}

}

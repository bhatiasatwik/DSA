package secondSem;

public class abStringRec {

	public static void main(String[] args) {
	String s="bba";
	System.out.println(check(s));
	}
	static boolean check(String s)
	{
	
		if(s.length()==1)
		{
			return (s.charAt(0)=='a');
		}
		boolean sa=check(s.substring(0, s.length()-1));
		if(s.charAt(s.length()-1)=='a')
		{
			if(s.charAt(s.length()-2)=='a')
				return sa;
			else if(s.charAt(s.length()-2)=='b'&&s.charAt(s.length()-3)=='b')
				return sa;
			else 
				return false;
		}
		else if(s.charAt(s.length()-2)=='b'&&s.charAt(s.length()-3)=='a')
		{
			return sa;
		}
		else 
			return false;
			
	}

}

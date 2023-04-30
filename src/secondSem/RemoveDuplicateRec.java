package secondSem;

public class RemoveDuplicateRec {
	public static void main(String[] args) {
		String s="aabbccdddddddaaa";
		System.out.println(remove(s));
	}

	static String remove(String s)
	{
		String ans="";
		if(s.length()==1)
		{
			return s;
		}
		String sm=remove(s.substring(1));
		if(s.charAt(0)==s.charAt(1))
			return sm;
		else 
			return s.charAt(0)+sm;
	}
}

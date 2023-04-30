package recursiom;

public class RemoveConsecDup {

	public static void main(String[] args) {
	String s="aabbccddaaabbbd";
	System.out.println(remove(s));
	}
	
	static String remove(String s)
	{
		if(s.length()==1)
			return s;
		String sa=remove(s.substring(1));
		if(s.charAt(0)==s.charAt(1))
			return sa;
		else
		return s.charAt(0)+sa;
	}

}

package recursiom;

public class RemoveX {
	public static void main(String[] args) {
		
		String s="axbxcxdx";
		System.out.println(remove(s));
	}
	static String remove(String s)
	{
		if(s.length()==1)
		{
			if(s.equals("x"))//Do not do s=="x" as not good way to compare strings;
				return "";
			else
				return s;
		}
		String sa=remove(s.substring(1));
		if(s.charAt(0)=='x')
			return sa;
		else
			return s.charAt(0)+sa;
	}
}

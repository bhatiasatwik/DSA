package recursiom;

public class ReplaceChar {

	public static void main(String[] args) {
		String s="e Erie noises e";
		System.out.println(replace(s,'e','@'));

	}
	static String replace(String s , char a , char b)
	{
		if(s.length()==0)
		{
			return "";		}
			String sa=replace(s.substring(1),a,b);
			if(s.charAt(0)==a)
				return b+sa;
			else
				return s.charAt(0)+sa;
	}

}

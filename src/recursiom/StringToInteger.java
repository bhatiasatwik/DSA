package recursiom;

public class StringToInteger {
	public static void main(String[] args) {
//		System.out.println(convert("123"));
		System.out.println(convert("123"));
	}
	static int  convert(String s)
	{
		if(s.length()==1)
		{
			return s.charAt(0)-48;
		}
		int sa=convert(s.substring(1));
		int n=s.charAt(0)-48;
		return ((n*10)+sa);
	}

}

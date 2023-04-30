package recursiom;

public class Palindrome {

	public static void main(String[] args) {
		String s = "abcdfcba";
		System.out.println(isPalin(s));
	}
	static boolean isPalin(String s)
	{
		if(s.length()==1)
			return true;
		if(s.length()==0)
			return true;
		boolean sa=isPalin(s.substring(1, s.length()-1));
		if(s.charAt(0)==s.charAt(s.length()-1))
			return sa;
		else
			return false;
	}

}

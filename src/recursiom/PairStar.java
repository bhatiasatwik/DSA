package recursiom;

public class PairStar {

	public static void main(String[] args) {
		System.out.println(star(""));
	}
	static String star(String s)
	{
		if(s.length()==1)
			return s;
		String sa=star(s.substring(1));
		if(s.charAt(0)==s.charAt(1))
			return (s.charAt(0)+"*"+sa);
		else
			return s.charAt(0)+sa;
	}

}

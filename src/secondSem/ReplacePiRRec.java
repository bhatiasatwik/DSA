package secondSem;

public class ReplacePiRRec {

	public static void main(String[] args) {
		System.out.println(rep("help ipi"));
		
	}
	static String rep(String s)
	{
		String ans="";
		if(s.length()==0)
			return "";
		if(s.charAt(0)=='p'&&s.charAt(1)=='i')
			return "3.14"+ rep(s.substring(2));
		else 
			return(s.charAt(0)+rep(s.substring(1)));
	}

}

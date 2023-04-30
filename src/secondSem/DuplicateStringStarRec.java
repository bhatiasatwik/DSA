package secondSem;

public class DuplicateStringStarRec {

	public static void main(String[] args) {
		String s="helllo";
		System.out.println(star(s));
	}
	static String star(String s)
	{
		String ans="";
		if(s.length()==1)
			return s;
		ans=star(s.substring(1));
		if(s.charAt(0)==s.charAt(1))
			return(s.charAt(0)+"*"+ans);
		return s.charAt(0)+ans;
		
			
	}
	

}

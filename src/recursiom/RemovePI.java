package recursiom;

public class RemovePI {

	public static void main(String[] args) {
		String s="help";
		System.out.println(replace(s));
	}
	static String replace(String s)
	{
		if(s.length()==1)//not zero as charat1 will go eror
			return s;
			
		
		String sa=replace(s.substring(1));
		if(s.charAt(0)=='p'&&s.charAt(1)=='i')
			return ("3.14"+sa.substring(1));
		else
			return (s.charAt(0)+sa);
	}
	

}

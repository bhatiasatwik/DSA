package secondSem;

public class RemoveCharRec {

	public static void main(String[] args) {
		String s="helpilopi";
		System.out.println(replace(s));
	}
	static String replace(String  str)
	{ 	String ans="";
	int i=0;
	if(str.length()==0)
		return "";
	
	if(str.charAt(0)=='p'&&str.charAt(1)=='i')
	{
		ans=replace(str.substring(i+2));
		return "3.14"+ans;
	}	
	return str.charAt(0)+replace(str.substring(i+1));
}
}

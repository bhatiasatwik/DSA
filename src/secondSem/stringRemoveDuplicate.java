package secondSem;

import java.util.Stack;

public class stringRemoveDuplicate {
	public static void main(String[] args) {
		System.out.println(remove("abxxba"));
	}
	static String remove(String s)
	{
		if(s.length()==0||s.length()==1)
			return s;
		if(s.charAt(0)==s.charAt(1))
		{
			String sa=remove(s.substring(2));
			return sa;
		}
		else
		{
			String sa=remove(s.substring(1));
			if(sa==""||s.charAt(0)!=sa.charAt(0))
			{
				return s.charAt(0)+sa;
			}
			else
			{
				return sa.substring(1);
			}
			
		}
	}
}
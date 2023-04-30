package secondSem;

public class RemoveConsecutiveDuplicates {
	public static void main(String[] args) {
	
		String s="aaabbccdddd";
		String res=s.charAt(0)+"";
		for(int i=1;i<s.length();i++)
			{if(s.charAt(i)!=s.charAt(i-1))
				res+=s.charAt(i);
				
		}
		System.out.println(res);
	}
}

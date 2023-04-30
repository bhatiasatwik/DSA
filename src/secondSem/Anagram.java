package secondSem;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("abcd","dbca"));
	}
	static boolean isAnagram(String s1,String s2)
	{
		if(s1.length()!=s2.length())
			return false;
		int a[]=new int[256];
		for(int i=0;i<s1.length();i++)
		{
			a[s1.charAt(i)]++;
		}
		for(int i=0;i<s2.length();i++)
		{
			a[s2.charAt(i)]--;
		}
		for(int i=0;i<256;i++)
		{
			if(a[i]!=0)
				return false;
		}
		return true;
	}

}

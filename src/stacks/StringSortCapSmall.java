package stacks;

public class StringSortCapSmall {

	public static void main(String[] args) {
		String s="abdcAbD";
	sort(s);
	}
	
	static void sort(String s)
	{
		int fs[]=new int[26];
		int fc[]=new int[26];
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=97&&s.charAt(i)<=122)
			{
				fs[s.charAt(i)-97]++;
			}
			else
				fc[s.charAt(i)-65]++;
		}
		for(int i=0;i<26;i++)
		{
			while(fs[i]!=0)
			{
				System.out.println((char)(i+97));
				fs[i]--;
			}
			while(fc[i]!=0)
			{
				System.out.println((char)(65+i));
				fc[i]--;
			}
		}
	}

}

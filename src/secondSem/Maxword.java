package secondSem;

public class Maxword {

	public static void main(String[] args) {
	String s = "Hello my name is satwikBhatia ";
	int i=0,j=0;
	int c=0,m=0;
	for(int k=0;k<s.length();k++)
	{
		if(s.charAt(k)==' ')
		{
			if(m<c)
			{	i=j;
				j=k;
				c=0;
			}
		}
			else 
				c++;
		}
	
	for(int k=i;k<j;k++)
	{
		System.out.println(s.charAt(k));
	}

	}

}

package secondSem;

public class arrayUnion {

	public static void main(String[] args) {
		int a[]= {2,5,5,13,13};
		int b[]= {2,5,13};
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=c;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
					c=j+1;
					break;
				}
			}
		}

	}

}

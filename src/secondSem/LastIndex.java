package secondSem;

public class LastIndex {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,1,3,2};
		System.out.println(index(a,1,7));
	}
	static int index(int b[],int n,int size)
	{
		if(size==1)
		{
			if(b[size-1]==n)
				return size-1;
			else 
				return -1;
		}
		if(b[size-1]==n)
		{
			return size-1;
		}
			return index(b,n,size-1);
	}

}

package secondSem;
//Calculate sum.traverse through array and check where sum of left==right
public class arrayEquilib {
	public static void main(String[] args) {
		int arr[]= {6 ,1, 6, 5, 3, 2, 5, 0, 5, 6, 0 };
		int s=0;
		int s1=0;
		int s2;
		int index=-1;
		int n=arr.length;
		
		for(int i=0;i<n;i++)
		{
			s+=arr[i];
			
		}
		for(int i=0;i<n-1;i++)
		{
			s1+=arr[i];
			s2=s-s1-(arr[i+1]);  //Dont forget to subtract the value of equi index.
			if(s1==s2)
			{	index=i+1;
				break;
			}
		}
		System.out.println(index);
	}

}

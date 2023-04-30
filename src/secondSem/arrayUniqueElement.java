package secondSem;

public class arrayUniqueElement {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,3,2,1};
		int n =arr.length;
			for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
		}
			for(int i=0;i<n;i++)
			{
				System.out.println(arr[i]);
			}
			for(int i=0;i<n-1;i++)
			{
				if(arr[i]==arr[i+1])
					i++;
				else 
					System.out.println(arr[i]);
			}
	}
}

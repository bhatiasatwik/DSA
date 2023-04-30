package queue;

public class Double_Queue_array {
	int arr[];
	int size;
	
	public Double_Queue_array()
	{
		arr=new int[10];
		size=0;
	}
	
	void insertFront(int n)
	{
		if(size==10) 
		{
			System.out.println("-1");
			return;
		}
		for(int i=size-1;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[0]=n;
		size++;
	}
	
	void insertRear(int n)
	{
		if(size==10) 
		{
			System.out.println("-1");
			return;
		}
		arr[size]=n;
		size++;
	}
	
	int deleteFront()
	{
		if(size==0)
			return -1;
		int t=arr[0];
		for(int i=0;i<size-1;i++)
		{
			arr[i]=arr[i+1];
		}
		size--;
		return t;
	}
	
	int deleteRear()
	{
		if(size==0)
			return -1;
		int t=size-1;
		size--;
		return arr[t];
	}
	
	int getFront()
	{
		if(size==0)
			return -1;
		return arr[0];
	}
		
	int getRear()
	{
		if(size==0)
			return -1;
		return arr[size-1];
	}
	
}

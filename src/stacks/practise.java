package stacks;

public class practise {
	
	int arr[];
	int size;
	int ind;
	
	public practise() {
		arr=new int [10];
		size=0;
		ind =-1;
		
	}
	
	void push(int n)
	{
		if(ind+1==arr.length)
			doublec();
		arr[++ind]=n;
		size++;
	}
	
	int pop()
	{
		if()
		int t=arr[ind];
		ind--;
		size--;
		return t;
	}
	
	int top()
	{
		return arr[ind];
	}
	
	boolean isEmpty()
	{
		return ind==-1;
	}
	void doublec()
	{
		int t[];
		t=arr;
		arr=new int[2*t.length];
		for(int i=0;i<t.length;i++)
			arr[i]=t[i];
	}
	int size()
	{
		return size;
	}
}

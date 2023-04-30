package oops;

public class DynamicArray {
	int data[];
	int c;
	
	public DynamicArray()
	{
		data=new int[5];
		c=0;
	}
	
	int getElement(int i)
	{
		if(i>c)
			return -1;
		return data[i];
	}
	
	int size()
	{
		return c;
	}
	
	
	void set(int a,int i)
	{	
		if(i<data.length)
		
		data[i]=a;
				
	}
	 void add(int i)
	 {
		 if(c>=data.length)
		 { extend();}
		 data[c]=i;
		 c++;
	 }
	 
	 
	void extend()
	 {
		 int temp[] =data;
		 data=new int[2*(temp.length)];
		 for(int i=0;i<temp.length;i++)
		 {
			 data[i]=temp[i];
		 }
	 }

	
}

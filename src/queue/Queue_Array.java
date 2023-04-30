package queue;

public class Queue_Array {
	private int a[];
	private int front;
	 int rear;
	private int size;
	
	public Queue_Array() 
	{
		a=new int[3];
		front=-1;
		rear=-1;
		size=0;
	}
	
	public int size()
	{
		return size;
	}
	
	
	public boolean isEmpty()
	{	
		return size==0;
	}
	
	
	public int front()
	{	
		if(size==0)     //also front==-1
			return -999999;
		return a[front];
	}
	
	public void enqueue(int n)
	{	
		/*if(rear==a.length-1)             //Note not length but length -1
			return ;
		if(front==-1)
			front++;
		rear++;						//<-------------- because of this updat.  as fun
		a[rear]=n;						// will not end for size -1 and rear++
		size++;	*/					//  will be updated to size hence AOB exep.
		
		
		if(size==a.length)
			increasecapacity(); 	//to make dyanamic 
		if(size==0)
			front=0;
		rear++;
		if(rear==a.length)		//circular
			rear=0;
		a[rear]=n;
		size++;
		/*
		 * rear++;
		if(rear==a.length)		----->  rear=(rear+1)%(a.length)
			rear=0;
			*/ 
	}
	
	public int dequeue()
	{		
		/*if(front==-1)
			return -9999999;
		//if(front==-1||front==a.length-1)		//*#*
		{
			//front=rear=-1;		
			//return -99999;						
		}													
		int t = a[front];								
		front ++;										
		size--;
		if(front>rear)							//Entire queue dequed
		{
			front=-1;
			rear=-1;
		}
		return t;*/
		
		if(size==0)
			return -99999;
		int t =a[front];
		front ++;
		if(front==a.length)				//circular
			front =0;
		size--;
		if(size==0)
		{
			front =-1;
			rear=-1;
		}
		return t;
	}
	
	
	void increasecapacity()
	{
		System.out.println("Capacity");
		int t[]=a;
		int k=0;
		a=new int[2*t.length];
		for(int i=front ;i<t.length;i++)
		{
			a[k++]=t[i];
		}
		for(int i=0;i)
	}
	

	

}

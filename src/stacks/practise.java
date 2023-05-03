package stacks;
import linkedList.Node;
public class practise
{
	
	Node<Integer> head;
	Node<Integer> tail;
	int size;
	
	public practise() {
		head=null;
		tail=null;
	}
	void push(int data)
	{
		Node<Integer>n=new Node<Integer>(data);
		if(head==null)
		{
			head=n;
			tail=n;
		}
		else
		{
			tail.next=n;
			tail=n;
		}
		size++;
	}
	
	int pop()
	{
		Node<Integer> t=head;
		if(head==null)
			return -1;
		if(head==tail)
		{
			int temp=head.data;
			head=null;
			tail=null;
			size--;
			return temp;
		}
		while(t.next.next!=null)
		{
			t=t.next;
		}
		int temp=tail.data;
		tail=t;
		size--;
		return temp;		
	}
	
	int top()
	{
		if(tail==null)
			return -1;
		return  tail.data;
	}
	
	int size()
	{
		return size;
	}
	
	boolean isEmp()
	{
		
		return head==null;
	}
}

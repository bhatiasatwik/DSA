package queue;

import linkedList.Node;

public class Queue_LL {
	Node<Integer> head ;
	Node<Integer> tail ;
	
	public Queue_LL() {
		head=null;
	}
	
	 void enqueue(int n)
	{
		Node <Integer> node = new Node<Integer>(n);
		if(head==null)
		{
			head=node;
			tail=node;
		}
		else
		{
			tail.next=node;
			tail=node;
		}
	}
	 
	 int dequeue()
	 {
		 
		if(head==null)
			return -1;
		int t=head.data;
		head=head.next;
		if(head==null)
			tail=null;
		return t;
	 }
	 
	 int size()
		 {		if(head==null)
			 return -1;
			 	int i=0;
				Node <Integer> t =head;
				for( ;t!=null;t=t.next,i++);
				return i;
	 }
	 
	 boolean isEmpty()
	 {
		 return (head==null);
	 }
	 
	 int front()
	 {
		 if(head==null)
			 return -1;
		return head.data;
	 }
	 
	 

}

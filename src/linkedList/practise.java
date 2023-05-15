package linkedList;

import java.util.Scanner;

public class practise 
{
	
	public static void main(String[] args) {
//		NodeUse n = new NodeUse();
//		Node<Integer> head=n.input();
//		//..head=is(head,4);
//		//n.insertRec(head, 100, 2);
//	//	head=
//		head=is(head);
////		head=is(head,5,100);
//		n.print(head);
////		System.out.println(s);
		NodeUse n = new NodeUse();
	//	Node<Integer> head= n.input();
	Node<Integer>	head=n.mergeSort(n.input());
		n.print(head);
		
		}
	static Node<Integer> is(Node<Integer> head,int k)
	{
		NodeUse n = new NodeUse();
		Node<Integer> tail=head,temp=null,nh=null,nt=null;
		while(tail!=null)
		{
			for(int i=0;i<k-1;i++)
			{
				
				tail=tail.next;	
				if(tail==null)
				{
					nt.next=head;
					return nh;
				}
			}
			temp=tail.next;
			tail.next=null;
			n.reverse(head);
			if(nh==null)
			{
				nh=tail;
				nt=head;
			}
			else
			{
				nt.next=tail;
				nt=head;
			}
			head=temp;
			tail=temp;
		
			
		}
		return nh;
	}
}

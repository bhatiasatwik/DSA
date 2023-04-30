package queue;
import java.util.*;

public class Queue_questions {
	
	
		static void reverse(Queue<Integer> q)//To reverse the given queue
		{
			if(q.size()==0)
				return;
			int t=q.poll();
			reverse(q);
			q.add(t);
		}
		
		static void reverseForK(Queue<Integer>q,int k)//reverse fun for kReverse function
		{
			if(k==0)
				return ;
			int t=q.poll();
			reverseForK(q, k-1);
			q.add(t);			
		}
		
		static Queue<Integer> kReverse(Queue<Integer> q,int k)		//reverse only the first 
		{																									//n elements of the	given queue. 																									
			int l=q.size();
			reverseForK(q, k);
			for(int i=1;i<=l-k;i++)
			{
				q.add(q.poll());
			}
			return q;
		}
		public static void main(String[] args) {
			Queue<Integer> q = new LinkedList<Integer>();
			q.add(10);
			q.add(20);
			q.add(30);
			q.add(40);
			q.add(50);
			q=kReverse(q, 3);
			while(!q.isEmpty())
			{
				System.out.println(q.poll());
			}
			
		}

	}



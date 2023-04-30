package queue;

import java.util.Stack;

public class Queue_Stack {
	
	private Stack<Integer> s1;
	
	public Queue_Stack() {
		s1=new Stack<>();
	}

		int size()
		{
			return s1.size();
		}
		
		
		boolean isEmpty()
		{
			return s1.isEmpty();
		}
		
		void enqueue(int n)
		{
			s1.push(n);
		}
		
		int dequeue()
		{
			if(s1.isEmpty())
				return -1;
			if(s1.size()==1)
				return s1.pop();
			int t=s1.pop();
			int sa=dequeue();
			s1.push(t);
			return sa;
		}
		
		int front()
		{
			if(s1.isEmpty())
				return -1;
			int s=0;
			if(s1.size()==1)
			{
			s=s1.peek();
			return s;
			}
			int t=s1.pop();
			int sa=front();
			s1.push(t);
			return sa;
		}
		
}

package stacks;

public class StackUse {

	public static void main(String[] args)  
	{
		//Stack_Queue s = new Stack_Queue();
		practise s = new practise();
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.push(10);
		System.out.println(s.top());
		System.out.println(s.pop());
		System.out.println(s.top());
		System.out.println(s.top());
		System.out.println();
		
		s.push(20);
		s.push(30);
		System.out.println(s.size());
		System.out.println(s.top());
		System.out.println(s.pop());
		System.out.println(s.size());
		System.out.println(s.isEmp());
		System.out.println(s.pop());
		System.out.println(s.size());
		System.out.println(s.pop());
		System.out.println(s.size());
		s.push(10);
		s.push(10);
		s.push(10);
		s.push(10);
		s.push(10);
		System.out.println(s.size);
		
		
		//practise s = new practise();
		
		
	}

}

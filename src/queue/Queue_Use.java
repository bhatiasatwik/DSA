package queue;

public class Queue_Use {

	public static void main(String[] args) {
		
		Double_Queue_array q = new Double_Queue_array();
		System.out.println(q.getFront());
		q.insertRear(10);
		q.insertRear(20);
		System.out.println(q.getFront());
		q.insertRear(30);
		q.deleteRear();
		System.out.println(q.getRear());
//		q.deleteFront();
		System.out.println(q.getFront());
}
}
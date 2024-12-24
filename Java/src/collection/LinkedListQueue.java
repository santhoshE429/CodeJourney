package collection;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {

	public static void main(String[] args) {
		Queue Q=new LinkedList();
		
		Q.add(2.0);
		Q.offer(2);
		Q.offer(90);
		Q.offer(23);
		System.out.println(Q);
		
		System.out.println("Head of the element:"+Q.peek());
		
		Q.remove();
		System.out.println(Q);
		
		System.out.println("Head of the element "+Q.element());
		

	}

}

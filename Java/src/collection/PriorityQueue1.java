package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		Queue Q=new PriorityQueue();
		
		//Adding the Element to Priority Queue
		Q.add(30);
		Q.add(50);
		Q.add(20);
		Q.add(10);
		Q.add(40);
		Q.offer(60);
		System.out.println(Q);
		
		Q.peek();
		System.out.println(Q);
		//Removing the Element from head to Priority Queue
		Q.poll();
		System.out.println(Q);
		
		//Removing the Element to Priority Queue
		Q.remove(50);
		System.out.println(Q);
		
		//Head of the Queue
		System.out.println("Head of the Queue:"+Q.peek());
		
		Queue<String> Q1=new PriorityQueue();
		Q1.offer("J2SE");
		Q1.add("Sant");
		Q1.add("java");
		Q1.add("SQL");
		Q1.add("HTMl");
		Q1.offer("JS");
		Q1.offer("J2SE");
		System.out.println(Q1);
		
		
	
		System.out.println("Head of thr Queue:"+Q1.peek());
		
		
		
		
		
		
		

	}

}

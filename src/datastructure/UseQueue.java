package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue = new LinkedList<String>();

		//Adding elements to the Queue by add() method
		queue.add("Toyota");
		queue.add("Honda");
		queue.add("BMW");
		queue.add("Nissan");

		System.out.println("Elements in Queue: "+queue);
		queue.add("Lexus");
		System.out.println(queue);

		queue.peek();
		System.out.println(queue);

		queue.poll();
		System.out.println(queue);

		queue.remove();
		System.out.println(queue);
	}

}

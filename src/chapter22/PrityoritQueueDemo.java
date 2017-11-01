package chapter22;

import java.util.Collections;
import java.util.PriorityQueue;


public class PrityoritQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.offer("Oklahoma");
		queue.offer("Indiana");
		queue.offer("Georgia");
		queue.offer("Texas");
		
		while (queue.size() > 0) {
			System.out.print(queue.remove() + " ");
		}
		
		System.out.println();
		
		PriorityQueue<String> queue2 = new PriorityQueue<String>(4, Collections.reverseOrder());
		queue2.offer("Oklahoma");
		queue2.offer("Indiana");
		queue2.offer("Georgia");
		queue2.offer("Texas");
		
		while (queue2.size() > 0) {
			System.out.print(queue2.remove() + " ");
		}
		
	}

}

package util;
import java.util.*;
public class QueueTest {
	public static void main(String[] args){
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("둘리");
		queue.offer("마이콜");
		queue.offer("도우너");
		queue.offer("또치");
		
		System.out.println(queue.isEmpty());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		//비어있으면 null return 
		System.out.println(queue.poll());
	}
	
}

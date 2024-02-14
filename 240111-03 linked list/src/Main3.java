import java.util.Deque;
import java.util.LinkedList;

public class Main3 {
	public static void main(String[] args) {
		// LIFO (Last-in First-out) - Stack: 후입선출
		Deque<String> deque = new LinkedList<>(); // 양방향
		deque.push("원소1");
		deque.push("원소2");
		deque.push("원소3");
		deque.push("원소4");
		
		System.out.println(deque.size());
		System.out.println(deque);
		
		System.out.println(deque.pop());
		System.out.println(deque.pop());
		System.out.println(deque.pop());
		System.out.println(deque.pop());
		
	}
}

import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PlayingWithQueueAndPriorityQueue {

	public static void main(String[] args) {

		Deque<Integer> d = new LinkedList<>();
		d.add(1);
		d.add(2);
		d.add(3);
		d.add(4);
		d.add(5);
		d.add(6);

		d.pollLast();
		d.pollFirst();


		PriorityQueue<Integer> pq1 = new PriorityQueue<>();
		pq1.add(-12);
		pq1.add(2);
		pq1.add(1);
		pq1.add(12);
		pq1.add(-122);

		while(pq1.size() !=0)
		System.out.print(" " + pq1.poll());
		
		PriorityQueue<String> pq = new PriorityQueue<>(100, new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) {
				return arg0.length() - arg1.length();
			}
		});
		pq.add("Hello baby");
		pq.add("hahaha");
		pq.add("USAAA");
		pq.add("India");

		//while(pq.size() !=0)
		//System.out.print(" " + pq.poll());

	}

}

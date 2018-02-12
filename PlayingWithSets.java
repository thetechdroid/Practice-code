import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PlayingWithSets {

	public static void main(String[] args) {

		Set<Integer> set = new TreeSet<>();

		set.add(1);
		set.add(2);
		set.add(234);
		set.add(131);
		set.add(0);
		set.add(11);

		System.out.print(set + " ");

		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			// System.out.print(iter.next() + " ");
		}

		System.out.print("\n\n");

	}

}

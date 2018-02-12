package Islands;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

	int start, end;

	MergeIntervals(int s, int e) {
		start = s;
		end = e;
	}

	MergeIntervals() {
		start = 0;
		end = 0;
	}

	public static void main(String[] args) {

		List<MergeIntervals> list = new ArrayList<>();
		list.add(new MergeIntervals(1, 5));
		list.add(new MergeIntervals(3, 4));
		list.add(new MergeIntervals(2, 6));
		list.add(new MergeIntervals(12, 15));

		list = MergeIntervals.merge(list);
		// printList(list);

	}

	private static List<MergeIntervals> merge(List<MergeIntervals> list) {

		if (list == null || list.size() == 0)
			return null;

		Collections.sort(list, new Comparator<MergeIntervals>() {
			@Override
			public int compare(MergeIntervals i1, MergeIntervals i2) {
				if (i1.start != i2.start) {
					return i1.start - i2.start;
				} else {
					return i1.end - i2.end;
				}
			}
		});

		for (MergeIntervals m : list) {
			// System.out.println("(" + m.start + " " + m.end + ")");
		}

		List<MergeIntervals> result = new ArrayList<>();
		MergeIntervals first = list.get(0);

		for (int i = 0; i < list.size(); i++) {
			MergeIntervals curr = list.get(i);
			if (curr.start > first.end) {
				result.add(first);
				first = curr;
			} else {
				MergeIntervals temp = new MergeIntervals(first.start, Math.max(first.end, curr.end));
				first = temp;
			}
		}
		result.add(first);

		for (MergeIntervals m : result) {
			System.out.println("(" + m.start + " " + m.end + ")\n");
		}

		return result;

	}

}

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashTableVSHashMap {

	public static void main(String[] args) {

//		Map<Integer, Integer> htab = new Hashtable<>();
//		htab.put(1, 10);
//		htab.put(2, 10);
//		htab.put(5, 40);
//		htab.put(3, 30);
//		htab.put(4, 10);
//
//		Iterator<Integer> it = htab.keySet().iterator();
//		while (it.hasNext())
//			System.out.print(" " + htab.get(it.next()));
//
//		System.out.print("\n\n");

		Map<Integer, Integer> map = new HashMap<>();
		map.put(7, 17);
		map.put(1, 10);
		map.put(3, 89);
		map.put(6, 16);
		map.put(4, 10);
		map.put(5, 18);
		map.put(2, 23);

		Iterator<Integer> iter = map.keySet().iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next()+ ":");
			System.out.print(map.get(iter.hashCode()));
		}
		
		System.out.print("\n\n");
		
		//map = new TreeMap<>(map);
		//System.out.print("\n\n" + map);
		
		
		

	}

}

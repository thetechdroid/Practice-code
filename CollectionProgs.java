import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class CollectionProgs {

	public static void main(String[] args) {
		
		Map<Integer,Integer> map = new LinkedHashMap<>();
		map.put(1, 12);
		map.put(2, 10);
		map.put(null, 13);
		map.put(3, null);
		map.put(4, null);
		map.put(5, 15);
		
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()) {
			System.out.print(" " + map.get(it.next()));
		}
		
		
	}
	
	
	
}

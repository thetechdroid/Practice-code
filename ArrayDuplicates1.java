import java.lang.Math; 
import java.util.*; 

public class ArrayDuplicates
{
  public static void main(String[] args)
  {
    System.out.print("Character duplicates in string \n");
  
    String str = "geeks for geeks";
    char[] arr = str.toCharArray();
    
    Map<Character, Integer> hmap = new HashMap<Character, Integer>();
    int count = 0;
    
    for (Character c : arr){
      if (hmap.containsKey(c) && c != ' ')
      hmap.put(c,hmap.get(c)+1);
      else
      hmap.put(c, 1);
     }
    
    Set<Character> cset = hmap.keySet();
    for (Character c : cset){
    if (hmap.get(c) > 1)
    System.out.println(c + " ---> " + hmap.get(c));  
    }
    }
}

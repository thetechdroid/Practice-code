import java.lang.Math; 
import java.util.*; 

public class CharacterDuplicatesInOrder
{
  public static void main(String[] args)
  {
    System.out.print("Character duplicates in string \n");
  
    String str = "Geeks for Geeks";
    
    LinkedHashSet<Character> lset = new LinkedHashSet<Character>();
    
    System.out.print("Duplicate char is/are: "); 
    
    for (int i=0; i < str.length() ;i++){
    
      if (!lset.add(str.charAt(i)) && str.charAt(i) != ' ')
      System.out.print("" + str.charAt(i)); 
      else{
      lset.add(str.charAt(i));
      }
    }
    }
}
    
    
     
    

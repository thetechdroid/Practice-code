import java.lang.Math; 
import java.util.*; 

public class ArrayDuplicates
{
  public static void main(String[] args)
  {
    System.out.print("Array duplicates\n");
    int arr[] = new int[10];
    int n = 10;
    for (int i=0;i<n;i++){
    arr[i] = i;
    }
    
    arr[5]=4;
    arr[6]=4;
    arr[8]=9;
    
    Set<Integer> hset = new HashSet<Integer>();
    for (int i : arr){
      if (!hset.add(i))
      System.out.print(" " + i);
    }
    
    
    
  }
}

import java.lang.Math; 
import java.util.*; 

public class SumOfTwoNumbersToZero
{
  public static void main(String[] args)
  {
    System.out.print("Character duplicates in string \n");
    int[] arr = {-10,-20,30,10,50,20};
    Arrays.sort(arr); // {-20,-10,10,20,30,50};
    int start = 0, end = arr.length-1;
     while (start < end){
      if (arr[start] + arr[end] == 0){
       System.out.println("Numbers here are -> " + arr[start] + "  " +arr[end]);
        start++;end--;
      }
        if (arr[start] + arr[end] > 0){
        end--;
      }
     }
  }
}

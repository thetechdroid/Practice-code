import java.lang.Math; 
import java.util.*; 

public class RotateArray
{
  public static void main(String[] args)
  {
    System.out.print("Rotate Array \n");
    int[] arr = {1,2,3,4,5,6,7,8,9};
    rotate(arr,3); 
  }
  
  
  public static void rotate (int[] arr,int num){
    
    arr = reverse(arr,0,arr.length-1);
    arr = reverse(arr,0,num-1);
    arr = reverse(arr,num,arr.length-1);
    
    for(int i : arr)
    System.out.print(" " + i);
    
  }
  
   public static int[] reverse (int[] arr,int start, int end){
     while (start<end){
     int temp = arr[start];
     arr[start] = arr[end];
     arr[end] = temp;
     start++;end--;  
     }
     return arr;
  }
  

}
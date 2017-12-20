import java.lang.Math; 
import java.util.*; 

public class TwoMinNumberInArray
{
  public static void main(String[] args)
  {
    System.out.print("2 Min values in the Array \n");
    int[] arr = {2,3,4,1,6,7,8,9};
    findMin(arr);
    
  }
  
  
  public static void findMin (int [] arr){
  
  int min1 = arr[0];
  int min2 = arr[1];
  int n = arr.length;
    
  for (int i=0;i<n;i++){
    if (min1 <= arr[i] && arr[i] < min2){
     min2 = arr[i];
     }
    else if (arr[i] <= min1 && arr[i] < min2){
     min2 = min1;
     min1 = arr[i]; 
     }
    else
      i++;
  }  
    
    System.out.println("Two minimum values here are: " + min1 + " " + min2);
    
  }
  
}
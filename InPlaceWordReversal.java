import java.lang.Math; 

public class HelloWorld
{
    public static void main(String[] args)
  {
   System.out.print("Words reversal\n");
      
      String str = "Please reverse me";
      char arr[] = str.toCharArray();
      reverseWords(arr);
          
  }
  
  static void reverseWords(char [] arr){
  
    int i=0;
    
    for (int j =0;j < arr.length; j++){
      if (arr[j] == ' '){
      reverse(arr,i,j-1);
      i = j+1;  
      }
     }
    
    reverse(arr,i, arr.length -1);
    //reverse(arr,0, arr.length -1);
    
    for (char c : arr)
    System.out.print(c);
    
  }
  
  static void reverse (char[] arr, int i, int j){
      while(i<j){    
      char temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
        i++;j--;
     }
    
  }
  
  
  
}


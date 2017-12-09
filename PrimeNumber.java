import java.lang.Math; 
import java.util.*; 

public class HelloWorld
{
  public static void main(String[] args)
  {
    System.out.print("Finding prime number\n");
    
    int num = 11;
    boolean isPrime = false;
    
    if (num == 0 || num == 1){
    System.out.print("\nEnter other than 0 or 1");
    }
    
    if (num > 1){
    for (int i=2; i < num ;i++){
      if (num%i == 0){
      isPrime = false;
      break;
      }
      else
        isPrime = true;
    }
    
      if(isPrime)
      System.out.print("\nPrime number");
      else
      System.out.print("\nNot a Prime number");
     
     }
  }
}

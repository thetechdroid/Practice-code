package Samples;

public class SubtractionWorking
{

  public static void main(String[] args)
  {
    
    int a=32,b=67;
    
    System.out.print(sub(a,b));
    
  }
  
  
  static int sub(int a, int b){
  
    if (b==0) return a;
    while (b!=0){
      int carry = (~a&b);
    a = a^b;
    b = carry <<1;  
    }
    return sub(a,b);
  
  }
  
  
}


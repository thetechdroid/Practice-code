
import java.lang.Math; 

public class StringReversal2
{
  
  public static void main(String[] args)
  {
    
    System.out.print(" Strring reversal here");
    
    String str = "hey, how are you";
    String rev = reverse(str);
    
    System.out.print("\n======Printing reverse string=====\n" + rev);
    
  }
  
  public static String reverse(String str){
  
  if(str.length()==0 )
    return null;
  
   if(str.length()==1)
    return str;
	
    else
    return (reverse(str.substring(1))+ str.charAt(0));
  }
  
  
}
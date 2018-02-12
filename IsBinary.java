
import java.lang.Math; // headers MUST be above the first class

public class IsBinary
{
  public static void main(String[] args)
  {
    int num = 10100011;
		boolean isBin = false;
		int rem;
		while (num > 1) {
			rem = num % 10;
			if (rem == 0 || rem == 1) {
				isBin = true;
				
			}
          else{
           isBin = false;
            break;
          }
          num /= 10;
		}

		if (isBin)
			System.out.println("The number is a binary number");
		else
			System.out.println("The number is not a binary number");
  }
}


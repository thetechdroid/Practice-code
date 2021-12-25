import java.lang.Math; 
import java.util.*; 

public class AddPlusOneArray
{
  public static void main(String[] args)
  {
	System.out.print("Adding +1 to array of numbers \n");

	int [] arr = {1,9,9};

	//result = {2,0,0};

	int l = arr.length-1;

	if (arr[l] != 9 ){
	arr[l] = arr[l]+1;
	  }
	else{
	  //arr[l-1] = 0;
	  //arr[l-2] = arr[l-2]+1;

	  int j = arr.length - 1;
	  while (j>=0){
		  if (arr[j]==9){
			arr[j] = 0;
			arr[j-1] = arr[j-1] +1;
			j--;
		 }
	   }


	  }

	for (int i : arr)
	System.out.print(" " + i);

  }


}

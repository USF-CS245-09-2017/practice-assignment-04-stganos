// import java.util.*;

public class BubbleSort implements SortingAlgorithm
{

	//sorts the array of integers using the "bubble sort method"
	@Override
	public void sort(int[] a)
	{
		//instance data
		boolean swapped = true;
		
		//while a pair of elements has been swapped within the most recent use of the for loop
		while (swapped == true)
		{
			swapped = false;
			//swaps pairs if not in order and changes boolean to indicate there has been a swap
			for (int i = 1; i < a.length; i++)
			{
				//checks if pairs are in order and swaps if they are not
				if (a[i-1] > a[i])
				{
					int temp = a[i];
					a[i] = a[i-1];
					a[i-1] = temp;
					swapped = true;
				}//if
			}//for
		}//while
	}//sort
}//class
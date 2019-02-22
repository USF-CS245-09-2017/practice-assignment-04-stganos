import java.util.*;

public class SelectionSort implements SortingAlgorithm
{
	// //constructor
	// public SelectionSort()
	// {
	// 	temp = 0;
	// }

	//sorts the array of integers using the "Selection sort method"
	@Override
	public void sort(int[] a)
	{
		//instance data
		int temp;
		int small;
		int smallIndex;

		for (int i = 1; i < a.length; i++)
		{
			small = a[i - 1];
			smallIndex = i - 1;
			for (int j = i; j < a.length; j++)
			{
				if (small > a[j])
				{
					small = a[j];
					smallIndex = j;
				}
			}
			temp = a[i - 1];
			a[i - 1] = small;
			a[smallIndex] = temp;
		}
	}
}
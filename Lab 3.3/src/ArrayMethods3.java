/*
 * Miriam Monroe and Ramisha Sarwar
 * Lab 3.3
 */
public class ArrayMethods3 {
	public static void main (String [] args)
	{
		int[] nums = {3,2,8,5,4};
		//insertionSort(nums);
		//selectionSort(nums);
		bubbleSort(nums);
		printArr(nums);
	}
	public static void insertionSort(int[] list1)
	{
        for (int i=1; i<list1.length; ++i)
        {
            int key = list1[i];
            int j = i-1;
 
            while (j >= 0 && list1[j] > key)
            {
                list1[j+1] = list1[j];
                j = j-1;
            }
            list1[j+1] = key;
        }
	}
	public static void selectionSort(int[] list1)
	{
		int temp = 0;
		for(int i = 0; i < list1.length-1; i++)
		{
			int num = i;
			for(int j = i+1; j < list1.length; j++)
			{
				if(list1[j] < list1[num])
				{
					num = j;
				}
			}

			swap(list1, num, i);
		}

	}
	

	
	public static void bubbleSort(int[] list1)
	{
		for(int i = 0; i < list1.length-1; i++)
		{
			for(int j = 0; j < list1.length-i-1; j++)
			{
				if(list1[j+1] < list1[j])
				{
					swap(list1, j, j+1);
				}
			}
		}
	}
	
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void printArr(int[] list)
	{
		for(int i = 0; i<list.length; i++)
		{
			System.out.print(list[i] + " ");
		}
	}
}

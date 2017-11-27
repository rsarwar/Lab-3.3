
public class ArrayMethods3 {
	public static void main (String [] args)
	{
		int[] nums = {2,3,8,5,4};
		insertionSort(nums);
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
		int num = list1[0];
		//int front = 
		for(int i = 0; i < list1.length; i++)
		{
			if(list1[i] < num)
			{
				list1[i] = 
				num = list1[i];
			}
		}
	}
	public static void bubbleSort(int[] list1)
	{
		
	}
	public static void printArr(int[] list)
	{
		for(int i = 0; i<list.length; i++)
		{
			System.out.print(list[i] + " ");
		}
	}
}

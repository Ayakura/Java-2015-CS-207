package finalReview;

public class Rev5 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 8, 7};
		int testM1 = largest(array);
		System.out.println(testM1);
		int testM2 = indexOfLargest(array);
		System.out.println(testM2);
			
	}
	public static int largest(int[] data)
	{
		int max = data[0];
		for (int i = 0; i < data.length; i++)
		{
			if (data[i] > max) max = data[i];
		}
		return max;
	}
	
	public static int indexOfLargest(int[] data)
	{
		int max = data[0];
		int index = 0;
		for (int i = 0; i < data.length; i++)
		{
			if (data[i] > max)
			{
				max = data[i];
				index = i;
			}
		}
		return index;
	}
}

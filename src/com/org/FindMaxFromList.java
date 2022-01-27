package com.org;

public class FindMaxFromList
{
	private static void findMaxFromArray()
	{
//		Integer arr[] = {1, 10, 2, 6};
		Integer arr[] = { 6, 9, 11, 1, 10 };
		Integer max = arr[0];
		Integer secMax = arr[0];
		for (Integer element : arr) {
			if (element > max)
				max = element;
			else if (element > secMax)
				secMax = element;
		}
		System.out.println("Max. of list : " + max);
		System.out.println("Second Max. of list : " + secMax);
	}

	public static void main(String[] args)
	{
		findMaxFromArray();
	}
}

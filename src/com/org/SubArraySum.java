package com.org;

import java.util.Optional;

public class SubArraySum {

    public static int subArraySum(int[] arr, int len, int sum)
    {
        int current_sum, i, j;
        for (i =0; i < len; i++)
        {
            current_sum = arr[i];
            for (j = i + 1; j <= len; j++)
            {
                if (current_sum == sum)
                {
                    int p = j - 1;
                    // System.out.println("Sum found between indexes : " + i +" and " + p);
                    return 1;
                }
                if (current_sum > sum
                        || j == len)
                {
                    break;
                }
                current_sum = current_sum + arr[j];
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        // {6, 7, -4, -2, -1, 12, 9}
        int arr[] = {6, 7, -4, -2, -1, 12, 9};
        int subArraySum = subArraySum(arr, arr.length, 0);
        System.out.println("subArraySum :: " + subArraySum);
        if (subArraySum == 0)
        {
            System.out.println("WE HAVE SUB ARRAY : " + Boolean.TRUE);
        }
        else
        {
            System.out.println("WE HAVE SUB ARRAY : " + Boolean.FALSE);
        }

    }
}

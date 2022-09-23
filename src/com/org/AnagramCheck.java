package com.org;

import java.util.Arrays;
import java.util.Locale;

public class AnagramCheck {
    public static boolean isAnagram(String str1, String str2)
    {
        char[] c1 = str1.toLowerCase(Locale.ROOT).toCharArray();
        char[] c2 = str2.toLowerCase(Locale.ROOT).toCharArray();

        int n1 = c1.length;
        int n2 = c2.length;

        // check for length and if not same return false
        if (n1 != n2)
        {
            return false;
        }

        // sort both the strings
        Arrays.sort(c1);
        Arrays.sort(c2);

        // compare both the sorted strings
        for (int i = 0; i < n1; i++)
        {
            // check char at index in both the strings
            if (c1[i] != c2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("Tea", "Eat"));
    }
}

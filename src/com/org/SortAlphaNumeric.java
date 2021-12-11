package com.org;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortAlphaNumeric {

    public static void main(String[] args) {
	// write your code here
    //Input:
    //A11, C5, C3, B3, A3, D1, D2

    // Create a model class for seat numbers

    // override compare
    // collections sort

    Pattern p = Pattern.compile("^[A-Za-z](\\d+)");
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String seat1, String seat2) {
                Matcher m = p.matcher(seat1);
                Integer num1 = null;
                if (!m.find())
                {
                    return seat1.compareTo(seat2);
                }
                else
                {
                    Integer num2 = null;
                    Integer i = Integer.parseInt(m.group(1));
                    num1 = i;
                    m = p.matcher(seat2);
                    if (!m.find())
                    {
                        return seat1.compareTo(seat2);
                    }
                    else
                    {
                        num2 = Integer.parseInt(m.group(1));
                        int comparision = num1.compareTo(num2);
                        if (comparision != 0)
                        {
                            return comparision;
                        } else {
                            return seat1.compareTo(seat2);
                        }
                    }
                }
            }
        };

        String[] input = {"A11", "C5", "B3", "A3", "D1", "D2"};
        List<String> inputExample = Arrays.asList(input);
        Collections.sort(inputExample,comparator);
        System.out.println(inputExample);
        // stream
        // compare
        //sort
    }

}

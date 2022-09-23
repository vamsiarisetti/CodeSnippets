package com.org;

public class BracesCheck {
    public static boolean braceSequenceCheck(String str)
    {
        // null and check for size
        if (null == str || (str.length() %2) != 0)
            return false;
        // else check for each character and validate the braces sequence
        else
        {
            char[] chars = str.toCharArray();
            for (char character: chars) {
                if (! (character == '{' || character == '[' || character == '('
                    || character ==  '}' || character == ']' || character == ')') )
                {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String bracesSequence = "{()}{}[]";
        System.out.println(braceSequenceCheck(bracesSequence));
    }
}

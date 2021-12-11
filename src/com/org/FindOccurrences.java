package com.org;

class FindOccurrences {
//    This is a Simple Text written in English
//    2 letter
//    3 letter
//    1 letter
//    count of second param
    public static void main(String[] args) {
        String sentence = "This is a Simple Text written in English".toLowerCase();
        System.out.println("2 Letter No. Of Occurrences : " + findNumberOfOccurences(sentence, "is"));
        System.out.println("3 Letter No. Of Occurrences : " + findNumberOfOccurences(sentence, "his"));
        System.out.println("1 Letter No. Of Occurrences : " + findNumberOfOccurences(sentence, "t"));
    }

    private static int findNumberOfOccurences(String sentence, String searchText) {
        int count = 0;
        int index = 0;
        while (true)
        {
            index = sentence.indexOf(searchText, index);
            if (index != -1) {
                count++;
                index+= searchText.length();
            } else {
                break;
            }
        }
        return count;
    }
}

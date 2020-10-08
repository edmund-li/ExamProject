package com.company;

public class Search {
    int[] array;
    public Search() {}
    //二分搜尋法。
    public static int binarySearch(final int[] array,final int targetValue) {
        //起始索引值。
        int startIndex = 0;
        //結尾索引值。
        int endIndex = array.length - 1;

        while(endIndex >= startIndex) {
            //無符號右移1位。
            final int middleIndex = (endIndex + startIndex) >>> 1;
            if (targetValue == array[middleIndex]) {
                //找到目標值回傳陣列索引。
                return middleIndex;
            }else if(targetValue > array[middleIndex]) {
                //目標值>陣列值。
                startIndex = middleIndex + 1;
            }else {
                //目標值<陣列值。
                endIndex = middleIndex - 1;
            }
        }
        //遍歷完畢，陣列值皆不符合，返回-1。
        return -1;
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	    //1.單例模式多執行緒安全建立方式範例。
        Singleton singleton = Singleton.getUkInstance();
        //2.二分搜尋法範例。
        int returnValue = Search.binarySearch(new int[]{1, 6 , 9 ,66, 102 , 220, 1990}, 102);
        if(returnValue ==-1) {
            System.out.println("BinarySearch found the target value.");
        }else {
            System.out.println("BinarySearch not found the target value.");
        }
    }
}

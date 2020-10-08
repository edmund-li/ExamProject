package com.company;

//雙重確認Locking單例模式(可兼顧效能及Lazy Initialization)。
public class Singleton {
    //宣告Singleton(使用Volatile可確保未完成初始化前，不會就被其它Thread使用)。
    private volatile static Singleton ukInstance;
    //宣吿Singleton建構子。
    private Singleton() {}

    public static Singleton getUkInstance() {
        //檢查是否建立Singleton。
        if(ukInstance == null) {
            //第一次建立時，才會進入同步區，避免被其它Thread搶佔，可提升效能。
            System.out.println("確認目前尚未建立Singleton。");
            synchronized (Singleton.class) {
                System.out.println("上鎖，準備建立Singleton。");
                //檢查是否建立Singleton。
                if(ukInstance == null) {
                    System.out.println("再次檢查Singleton，是否已被其它Thread建立，若否則建立Singleton。");
                    ukInstance = new Singleton();
                    System.out.println("已完成建立Singleton。");
                }
            }
        }
        System.out.println("回傳Singleton完畢。");
        return ukInstance;
    }
}

package com.belizer.designPattern.singleton;

/**
 * Created by 47131 on 2018/3/8.
 */
public class Lazy {
    private Lazy(){}

    private static Lazy instance=null;

    public static Lazy getInstance(){
        if(null==instance){
            instance=new Lazy();
        }
        return instance;
    }
}

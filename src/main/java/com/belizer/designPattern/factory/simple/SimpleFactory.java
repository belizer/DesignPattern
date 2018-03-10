package com.belizer.designPattern.factory.simple;

import com.belizer.designPattern.factory.HAIJINGHouse;
import com.belizer.designPattern.factory.HUIQIANHouse;
import com.belizer.designPattern.factory.House;

/**
 * Created by 47131 on 2018/3/4.
 */
public class SimpleFactory {
    public static  House getHouse(String name){
        if("HAIJING".equals(name)){
            return new HAIJINGHouse();
        }else if("HUIQIAN".equals(name)){
            return new HUIQIANHouse();
        }else{
            System.out.println("我们不能提供您需要的商品");
            return null;
        }
    }
}

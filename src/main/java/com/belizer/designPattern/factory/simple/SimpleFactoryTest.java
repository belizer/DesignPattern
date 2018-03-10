package com.belizer.designPattern.factory.simple;

import com.belizer.designPattern.factory.House;

/**
 * Created by 47131 on 2018/3/4.
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory=new SimpleFactory();
        House haijingHouse=simpleFactory.getHouse("HAIJING");//这是需要海景房，如果需要的是小公寓，我们就要创建小公寓这个类型的房子，然后修改SimpleFactory的getHouse方法的实现。
        haijingHouse.live();
        //SimpleFactory2.getHouse("fksdk");
    }
}

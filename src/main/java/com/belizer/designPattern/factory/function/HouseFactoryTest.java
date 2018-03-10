package com.belizer.designPattern.factory.function;

/**
 * Created by 47131 on 2018/3/4.
 */
public class HouseFactoryTest {
    public static void main(String[] args) {
        new HANGDAHouseFactory().getHouse();//去找恒大才能建海景房，如果要建小公寓，同样需要创建小公寓这个类型的房子，然后创建小公寓类型房子的工厂。
    }
}

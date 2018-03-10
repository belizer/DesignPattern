package com.belizer.designPattern.factory.function;

import com.belizer.designPattern.factory.HAIJINGHouse;
import com.belizer.designPattern.factory.House;

/**
 * Created by 47131 on 2018/3/4.
 *
 * 恒大只造海景房。
 */
public class HANGDAHouseFactory implements HouseFactory {
    public House getHouse() {
        return new HAIJINGHouse();
    }
}

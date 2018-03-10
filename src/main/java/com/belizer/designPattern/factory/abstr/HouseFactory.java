package com.belizer.designPattern.factory.abstr;

import com.belizer.designPattern.factory.HAIJINGHouse;
import com.belizer.designPattern.factory.HUIQIANHouse;
import com.belizer.designPattern.factory.House;

/**
 * Created by 47131 on 2018/3/4.
 */
public class HouseFactory extends AbtractFactory {
    public House getHAIJINGHouse() {
        return new HAIJINGHouse();
    }

    public House getHUIQIANHouse() {
        return new HUIQIANHouse();
    }
}

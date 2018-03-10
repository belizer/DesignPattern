package com.belizer.designPattern.factory.function;

import com.belizer.designPattern.factory.HUIQIANHouse;
import com.belizer.designPattern.factory.House;

/**
 * Created by 47131 on 2018/3/4.
 * 中国一建只造回迁房
 */
public class YiJianHouseFactory implements HouseFactory {
    public House getHouse() {
        return new HUIQIANHouse();
    }
}

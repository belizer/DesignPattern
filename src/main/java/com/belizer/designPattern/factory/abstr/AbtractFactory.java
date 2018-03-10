package com.belizer.designPattern.factory.abstr;

import com.belizer.designPattern.factory.House;

/**
 * Created by 47131 on 2018/3/4.
 */
public abstract class AbtractFactory {
    //可以写一些公共的逻辑，比如生产过程等等

    public abstract House getHAIJINGHouse();

    public abstract House getHUIQIANHouse();
}

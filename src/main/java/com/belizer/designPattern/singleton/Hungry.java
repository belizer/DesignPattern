package com.belizer.designPattern.singleton;

/**
 * Created by 47131 on 2018/3/7.
 *
 * 紫霞云烟遮归路,青瘴水雾阻前途.
 * 凭风空瞑应无物,人间何曾有绝处?
 * 千里追风逐落日,万丈绝壑看朝露,
 * 临江夜读史书记,笑叹英雄不逢时.
 */
public class Hungry {
    private Hungry(){}

    private static final Hungry instance=new Hungry();

    public static Hungry getInstance(){
        return instance;
    }
}

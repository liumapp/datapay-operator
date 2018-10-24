package com.liumapp.datapay.government.status;

/**
 * file EntTypeEnum.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/10/24
 */
public enum EntTypeEnum {

    //企业
    COMPANY(0),

    //个体工商户
    INDIVIDUAL_BUSINESSES(1);

    private Integer value;

    private EntTypeEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}

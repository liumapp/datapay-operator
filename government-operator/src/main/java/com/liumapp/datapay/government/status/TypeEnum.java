package com.liumapp.datapay.government.status;

/**
 * file TypeEnum.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/10/24
 */
public enum TypeEnum {

    //企业全称
    NAME("name"),

    //统一社会信用代码
    CREDIT_CODE("creditcode"),

    //注册号
    REGNO("regno");

    private String value;

    private TypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

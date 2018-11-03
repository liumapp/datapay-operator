package cn.haoxy.sms.operator.bean;

import org.springframework.stereotype.Component;

/**
 * Created by haoxy on 2018/11/3.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@Component
public class SmsApi {

    private String userCode;

    private String userPass;

    private String url;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public SmsApi(String userCode, String userPass, String url) {
        this.userCode = userCode;
        this.userPass = userPass;
        this.url = url;
    }

    public SmsApi() {
    }
}

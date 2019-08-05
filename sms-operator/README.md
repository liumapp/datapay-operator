# sms operator

短信发送

## how to use

* 通过Maven加载依赖
        
       <dependency>
            <groupId>com.liumapp.datapay</groupId>
             <artifactId>sms-operator</artifactId>
             <version>v2.0.4</version>
       </dependency>
        
* 在SpringBoot启动类上通过注解引入Main Class

        @Import({
                SmsOperatorMain.class
        })        
        
* 配置app key

        com:
          haoxy:
            sms:
              userCode: username 
              userPass: password
              signTrue: 【放心签】
                 
        
* 使用
        
        @Autowired
        private SendSms sendSms;
                
        Parameter parameter = new Parameter();
        parameter.setPhone("187xxxxxxxx");
        parameter.setContent("这是短信内容【放心签】"); //如果在application.yml文件中配置了就不需要加【放心签】
        boolean status = sendSms.sendMessage(parameter);
       
* 注意
     
    * 短信内容中必须包含签名 格式为:(短信内容....【放心签】) 签名必须放在短信内容的后面,其中【放心签】即为签名,如果在application.yml
     配置了 com.haoxy.sms.signTrue=【放心签】,就不需要在短信内容的后面手动添加了【放心签】,他会从配置文件中加载
     
    * 不要使用application.properties文件,这样会出现中文乱码情况,所以要用 .yml文件   
                   
                       
* 返回结果为

        true: 表示为发送成功
        
        false: 表示发送失败 
        
      
    
    

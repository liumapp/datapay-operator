# imageid operator

获取图片的 imageId

## how to use

* 通过Maven加载依赖
        
      <dependency>
        <groupId>com.liumapp.datapay</groupId>
         <artifactId>imageId-operator</artifactId>
         <version>v1.1.7</version>
      </dependency>
        
* 在SpringBoot启动类上通过注解引入Main Class

        @Import({
                ImageOperatorMain.class
        })        
        
* 配置app key

        com:
          haoxy:
            image:
              appkey: your app key here                           
                 
        
* 使用
        
       @Autowired
       private ImageOperator imageOperator;
                
       JSONObject handle = imageOperator.handle("图片地址");
       
* 返回结果:  


    {
    
      "msg":"上传成功",
      "code":"10000",
      "data":"2c4c7e0bca7d435691094f8e2314c569",
      "success":true
      
    } 
                   
其中data就是我们需要的imageId                       

      
    
    

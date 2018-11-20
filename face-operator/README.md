# face operator 

生活照与证件照头像比对（只需要上传生活照图片，证件照根据身份证号码获取）

## how to use

* 通过Maven加载依赖
                
        <dependency>
            <groupId>com.liumapp.datapay.face</groupId>
            <artifactId>face-operator</artifactId>
            <version>v2.0.0</version>
        </dependency>
                    
* 在SpringBoot启动类上通过注解引入Main Class

        @Import({
                FaceOperatorMain.class
        })        
        
* 配置app key

        com:
          liumapp:
            datapay:
              face:
                appkey: your app key here
        
* 使用

      @Autowired
      private FaceOperator faceOperator;
      
      JSONObject result = faceOperator.handle("姓名","身份证号码", Base64FileTool.filePathToBase64("生活照存储路径"));
                       
* 返回结果为

        {"code":"10000","data":{"score":0.9019902348518372},"seqNo":"S51794FW1808281518","message":"成功"}
        
    * seqNo 接口调用唯一标志
    * score 生活照与身份证证件照匹配得分，最高为1.0，最低分为0，建议使用0.66


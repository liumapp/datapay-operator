# datapay-operator
China data pay api operator .
数据宝六类API的Spring Boot操作工具类

## 简介

* bankcard-operator

    银行卡四要素认证
    
    根据姓名、身份证号码、银行卡号码、手机号码进行匹配查询，如果全部符合，则返回正确结果
    
    具体使用方式，请见bankcard-operator的[README.md](https://github.com/liumapp/datapay-operator/tree/master/bankcard-operator)
    
* face-operator

    人像比对
    
    根据姓名、身份证号码、包含人脸的生活照进行比对，返回生活照上的人脸与证件照上的人脸比对得分（最高分为1.0）
    
    证件照照片根据姓名和身份证号码得来
    
    具体使用方式，请见face-operator的[README.md](https://github.com/liumapp/datapay-operator/tree/master/face-operator)
    
* government-operator

    企业工商基础信息核验
    
    根据企业名称返回企业工商信息详情
    
    具体使用方式，请见government-operator的[README.md](https://github.com/liumapp/datapay-operator/tree/master/government-operator)
    
* ocr-operator

    身份证OCR识别
    
    根据身份证图片的Base64值返回证件信息
    
    具体使用方式，请见ocr-operator的[README.md](https://github.com/liumapp/datapay-operator/tree/master/ocr-operator)
    
* phone-operator

    全网手机三要素验证
    
    根据姓名、身份证号码、手机号码进行匹配查询，如果全部符合，则返回正确
    
    具体使用方式，请见phone-operator的[README.md](https://github.com/liumapp/datapay-operator/tree/master/phone-operator)
    
* realname-operator

    实名认证
    
    根据姓名、身份证号码进行匹配查询，如果全部符合，返回正确
    
    具体使用方式，请见realname-operator的[README.md](https://github.com/liumapp/datapay-operator/tree/master/realname-operator)
    
    
    
* sms-operator

    短信发送
    
    在使用前配置用户名和密码
    
    提供短信内容,手机号进行调用短信平台进行发送信息
    
    短信内容中必须包含签名 格式为:(短信内容....【放心签】) 签名必须放在短信内容的后面,其中【放心签】即为签名
    
    返回 true 即为成功, false 即为发送短信失败!

    具体使用方式，请见sms-operator的[README.md](https://github.com/liumapp/datapay-operator/tree/master/sms-operator)

* ocr-car-operator

    驾驶证OCR识别
    
    在使用前配置 appkey
    
    传入驾驶证的图片地址返回驾驶证图片中的详细信息
    
    具体使用方式，请见ocr-car-operator的[README.md](https://github.com/liumapp/datapay-operator/tree/master/ocr-car-operator)


* imageId-operator

    获取图片的imageId
    
    传入图片地址,返回的数据中data即是imageid

    具体使用方式，请见imageId-operator的[README.md](https://github.com/liumapp/datapay-operator/tree/master/imageid-operator)

 

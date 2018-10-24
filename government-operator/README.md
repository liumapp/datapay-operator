# government operator

企业工商信息认证接口

## how to use

* 通过Maven加载依赖
        
        <dependency>
            <groupId>com.liumapp.datapay.government</groupId>
            <artifactId>government-operator</artifactId>
            <version>v1.1.0</version>
        </dependency>
        
* 在SpringBoot启动类上通过注解引入Main Class

        @Import({
                GovernmentOperatorMain.class
        })        
        
* 配置app key

        com:
          liumapp:
            datapay:
              government:
                appkey: your app key here
        
* 使用

        @Autowired
        private GovernmentOperator governmentOperator;
        
        JSONObject result = governmentOperator.handle("企业名称");
                       
* 返回结果为

        {"code":"10000","data":{"basic":{"esdate":"成立日期","regno":"注册号","creditcode":"统一信用代码","dom":"住址","zsopscope":"经营业务范围","reccap":"实收资本","oriregno":"原注册号码","entnameeng":"企业英文名称","enttype":"企业类型","ancheyear":"最后年检时间","opto":"经营期限至","regcapcur":"注册资本币种","opfrom":"经营期限自","orgcodes":"组织机构代码","candate":"注销日期","entname":"企业名称","regcap":"注册资本（万元）","regorg":"登记机关","tel":"联系人电话","revdate":"吊销日期","entstatus":"经营状态","regorgcode":"注册地址行政编号","abuitem":"许可经营项目","frname":"法定代表人"}},"seqNo":"6B7UASIK1808271435","message":"成功"}
        
    * code 10000:成功; 10001:查询失败; 10002:企业数据为空
    * esdate 成立日期
    * regno 注册号
    * creditcode 统一信用代码
    * dom 住址
    * zsopscope 经营业务范围
    * reccap 实收资本
    * oriregno 原注册号
    * entnameeng 企业英文名称
    * enttype 企业类型
    * ancheyear 最后年检时间
    * opto 经营期限至
    * regcapcur 注册资本币种
    * opfrom 经营期限自
    * orgcodes 组织机构代码
    * candate 注销日期
    * entname 企业名称
    * regcap 注册资本（万元）
    * regorg 登记机关
    * tel 联系人电话
    * revdate 吊销日期
    * entstatus 经营状态
    * regorgcode 注册地址行政编号
    * abuitem 许可经营项目
    * frname 法定代表人
    * seqNo 调用唯一标志


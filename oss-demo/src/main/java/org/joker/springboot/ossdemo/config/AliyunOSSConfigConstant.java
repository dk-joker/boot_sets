package org.joker.springboot.ossdemo.config;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-10-11 14:50
 */
public class AliyunOSSConfigConstant {
    //私有构造方法 禁止该类初始化
    private AliyunOSSConfigConstant() {
    }

    //仓库名称
    public static final String BUCKE_NAME = "dk-joker-oss";
    //地域节点
    public static final String END_POINT = "oss-cn-beijing.aliyuncs.com";
    //AccessKey ID
    public static final String AccessKey_ID = "myAccessKeyID";
    //Access Key Secret
    public static final String AccessKey_Secret = "myAccessKeySecret";
    //仓库中的某个文件夹
    public static final String FILE_HOST = "test";
}


package com.hubpd.login.common.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 系统常量
 *
 * @author cpc
 * @create 2018-06-22 16:55
 **/
@Component
public class Constants {
    /**
     * 手机号码匹配正则
     */
    public static String PHONE_NUM_REG;
    /** 短信验证码在redis中保存时间--分钟 */
    public static Long MESSAGE_CODE_SAVE_CYCLE;
    /** 短信验证码可再次发送距离上次发送时间间隔--秒 */
    public static Long MESSAGE_CODE_RESEND_CYCLE;
    /** 短信验证码存储在redis中的key的前缀 */
    public static String MESSAGE_REDIS_PHONE_NUM_PREFIX_STR;


    /**
     * 用户注册密码
     */
    public static String USER_REGISTER_PASSWORD_REGIX;


    /** 短信接口相关信息----start */
    /** 短信接口app_id */
    public static String MESSAGE_APP_ID;
    /** 手机验证码请求url */
    public static String MESSAGE_URL;
    /** 手机验证码加盐格式 */
    public static String MESSAGE_SALT_MSG;
    /** 手机验证码输出模板--前缀 */
    public static String MESSAGE_CONTENT_MOULD_PREFIX;
    /** 手机验证码输出模板--后缀 */
    public static String MESSAGE_CONTENT_MOULD_SUFFIX;
    /**  短信接口相关信息----end */

    @Value("${phone_num_reg}")
    public void setPhoneNumReg(String phoneNumReg) {
        this.PHONE_NUM_REG = phoneNumReg;
    }

    @Value("${message_code_save_cycle}")
    public void setMessageCodeSaveCycle(Long messageCodeSaveCycle) {
        this.MESSAGE_CODE_SAVE_CYCLE = messageCodeSaveCycle;
    }

    @Value("${message_code_resend_cycle}")
    public void setMessageCodeResendCycle(Long messageCodeResendCycle) {
        this.MESSAGE_CODE_RESEND_CYCLE = messageCodeResendCycle;
    }

    @Value("${message_redis_phone_num_prefix_str}")
    public void setMessageRedisPhoneNumPrefixStr(String messageRedisPhoneNumPrefixStr) {
        this.MESSAGE_REDIS_PHONE_NUM_PREFIX_STR = messageRedisPhoneNumPrefixStr;
    }


    @Value("${message_app_id}")
    public void setMessageAppId(String messageAppId) {
        this.MESSAGE_APP_ID = messageAppId;
    }

    @Value("${message_url}")
    public void setMessageUrl(String messageUrl) {
        this.MESSAGE_URL = messageUrl;
    }

    @Value("${message_salt_msg}")
    public void setMessageSaltMsg(String messageSaltMsg) {
        this.MESSAGE_SALT_MSG = messageSaltMsg;
    }

    @Value("${message_content_mould_prefix}")
    public void setMessageContentMouldPrefix(String messageContentMouldPrefix) {
        this.MESSAGE_CONTENT_MOULD_PREFIX = messageContentMouldPrefix;
    }
    @Value("${message_content_mould_suffix}")
    public void setMessageContentMouldSuffix(String messageContentMouldSuffix) {
        this.MESSAGE_CONTENT_MOULD_SUFFIX = messageContentMouldSuffix;
    }


    @Value("${user_register_password_regix}")
    public void setUserRegisterPasswordRegix(String userRegisterPasswordRegix) {
        this.USER_REGISTER_PASSWORD_REGIX = userRegisterPasswordRegix;
    }
}

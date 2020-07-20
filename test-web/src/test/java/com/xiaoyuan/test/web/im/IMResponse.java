package com.xiaoyuan.test.web.im;

import lombok.Data;

/**
 * @author liyuan
 * @description IM创建直播聊天室响应
 * @date 2020/7/11 17:07
 */
@Data
public class IMResponse {

    /**
     * 请求处理的结果，OK 表示处理成功，FAIL 表示失败
     */
    private String ActionStatus;

    /**
     * 错误码，0表示成功，非0表示失败
     */
    private Integer ErrorCode;

    /**
     * 错误信息
     */
    private String ErrorInfo;

    /**
     * 聊天室唯一编码
     */
    private String GroupId;
}

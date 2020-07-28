package com.xiaoyuan.demo.mysql.random.po;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author liyuan
 * @description 主播
 * @date 2020-07-09 14:31:19
 */
@EqualsAndHashCode(callSuper = false)
@Data
@TableName("jshop_live_person")
public class JshopLivePersonDO extends BaseModel implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @JSONField(name = "id")
    private Long id;

    /**
     * 导购id
     */
    @JSONField(name = "jshopMemberId")
    private Long jshopMemberId;
    /**
     * 主播名称
     */
    @JSONField(name = "name")
    private String name;
    /**
     * 主播昵称
     */
    @JSONField(name = "nickName")
    private String nickName;
    /**
     * 手机号
     */
    @JSONField(name = "phone")
    private String phone;
    /**
     * 性别 1:男  2:女  默认 1
     */
    @JSONField(name = "sex")
    private Long sex;
    /**
     * 主播头像
     */
    @JSONField(name = "avatar")
    private String avatar;
    /**
     * 身份证号
     */
    @JSONField(name = "idCard")
    private String idCard;
    /**
     * 身份证正面
     */
    @JSONField(name = "idCardFront")
    private String idCardFront;
    /**
     * 身份证反面
     */
    @JSONField(name = "idCardBack")
    private String idCardBack;
    /**
     * 主播状态  1、可用，2、禁播
     */
    @JSONField(name = "personStatus")
    private Long personStatus;
}



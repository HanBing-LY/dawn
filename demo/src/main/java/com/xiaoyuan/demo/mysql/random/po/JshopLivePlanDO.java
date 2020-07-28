package com.xiaoyuan.demo.mysql.random.po;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author liyuan
 * @description  主播控制表
 * @date 2020-07-09 14:31:19
 */
@EqualsAndHashCode(callSuper = false)
@Data
@TableName("jshop_live_plan")
public class JshopLivePlanDO extends BaseModel implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId(value = "id", type = IdType.AUTO)
	@JSONField(name = "id")
	private Long id;

	/**
	 * 直播场次编码
	 */
	@JSONField(name = "liveCode")
	private String liveCode;

	/**
	 * 直播标题
	 */
	@JSONField(name = "title")
	private String title;

	/**
	 * 计划直播开始时间
	 */
	@JSONField(name = "planStartTime")
	private Date planStartTime;

	/**
	 * 计划直播结束时间
	 */
	@JSONField(name = "planEndTime")
	private Date planEndTime;

	/**
	 * 直播简介
	 */
	@JSONField(name = "brief")
	private String brief;

	/**
	 * 主播id
	 */
	@JSONField(name = "jshopLivePersonId")
	private Long jshopLivePersonId;

	/**
	 * 是否可用（0：否，1:是） 默认为1
	 */
	@JSONField(name = "isAvailable")
	private Long isAvailable;

	/**
	 * 是否推荐（0：否，1:是） 默认为0
	 */
	@JSONField(name = "isRecommend")
	private Long isRecommend;

	/**
	 * 是否允许评论（0：否，1:是）  默认是1
	 */
	@JSONField(name = "isComments")
	private Long isComments;

	/**
	 * 是否显示在线人数（0：否，1:是）默认是1
	 */
	@JSONField(name = "isShowNum")
	private Long isShowNum;

	/**
	 * 是否允许回放（0：否，1:是）默认是1
	 */
	@JSONField(name = "isPlayback")
	private Long isPlayback;

	/**
	 * 是否录制（0：否，1:是）默认是1
	 */
	@JSONField(name = "isRecord")
	private Long isRecord;

	/**
	 * 直播间封面
	 */
	@JSONField(name = "liveLcover")
	private String liveLcover;

	/**
	 * 排序
	 */
	@JSONField(name = "sort")
	private Long sort;

	/**
	 * 直播间推流地址
	 */
	@JSONField(name = "pushUrl")
	private String pushUrl;

	/**
	 * 直播间引流地址
	 */
	@JSONField(name = "pullUrl")
	private String pullUrl;

	/**
	 * IM即时通讯聊天室id
	 */
	@JSONField(name = "liveChatRoom")
	private String liveChatRoom;

	/**
	 * 录播地址(多个视频用逗号隔开)
	 */
	@JSONField(name = "liveVideoAddress")
	private String liveVideoAddress;

	/**
	 * 实际直播开始时间
	 */
	@JSONField(name = "realStartTime")
	private Date realStartTime;
	/**
	 * 实际直播结束时间
	 */
	@JSONField(name = "realEndTime")
	private Date realEndTime;

	/**
	 * 直播时长(分钟)
	 */
	@JSONField(name = "duration")
	private Long duration;

	/**
	 * 在线人数
	 */
	@JSONField(name = "onlineNum")
	private Long onlineNum;

	/**
	 * 观看人数
	 */
	@JSONField(name = "viewsNum")
	private Long viewsNum;

	/**
	 * 观看次数
	 */
	@JSONField(name = "viewsTimes")
	private Long viewsTimes;

	/**
	 * 平均观看时长( 秒)
	 */
	@JSONField(name = "avgViewsDuration")
	private Long avgViewsDuration;

	/**
	 * 直播状态 0:待开播;1:正在直播;2:异常退出;3:已结束
	 */
	@JSONField(name = "liveStatus")
	private Long liveStatus;

	/**
	 * 商品数
	 */
	@JSONField(name = "goodsNum")
	private Long goodsNum;

	/**
	 * 点赞数
	 */
	@JSONField(name = "thumb_num")
	private Long thumbNum;


}

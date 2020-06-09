package com.xiaoyuan.po.product;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @Title: ProductInfo
 * @ProjectName
 * @Description: TODO
 * @author 
 * @date Thu Dec 26 09:52:11 CST 2019
 */
@Data
@TableName("product_info")
@NoArgsConstructor
@AllArgsConstructor
public class ProductInfo implements Serializable {

    /** id */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /** 产品名称 */
    private String productName;
    /** 产品封面图 */
    private String productIcon;
    /** 产品原价（展示价格） */
    private Double productOldPrice;
    /** 产品售价（展示价格） */
    private Double productSalePrice;
    /** 产品详情 */
    private String productDesc;
    /** 1:下架 0:上架 */
    private Integer type;
    /** 销量 */
    private Integer saleNum;
    /**
     * 上架时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date pushTime;
    /**
     * 添加时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date addTime;
}


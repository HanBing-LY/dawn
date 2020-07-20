package com.xiaoyuan.test.web.im;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 * @author : liyuan  
 * @description :
 * @date : 2020-07-18 14:24  
 */
@Data
public class IMSendMes implements Serializable {

    @JSONField(name = "GroupId")
    private String GroupId;

    @JSONField(name = "Random")
    private Long Random;

    @JSONField(name = "MsgBody")
    private List<HashMap> MsgBody;

}

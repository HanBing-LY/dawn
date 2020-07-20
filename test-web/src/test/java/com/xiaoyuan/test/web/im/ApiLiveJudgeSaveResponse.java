package com.xiaoyuan.test.web.im;

import lombok.Data;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * @author : liyuan  
 * @description :
 * @date : 2020-07-18 22:35  
 */
@Data
public class ApiLiveJudgeSaveResponse implements Serializable {

    public String ApiVersion = "1.0";

    public boolean NeedRecord = true;

    public List<String> Format = Collections.singletonList("mp4");
}

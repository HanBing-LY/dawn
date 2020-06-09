package com.xiaoyuan.common.web;


import com.xiaoyuan.common.vo.response.JsonResult;
import com.xiaoyuan.common.vo.response.ResultStatus;

public class BaseController {

    public JsonResult success(String message, Object data){
        return new JsonResult(true, ResultStatus.SUCCESS,message,data);
    }

    public JsonResult success(String message){
        return new JsonResult(true, ResultStatus.SUCCESS,message,null);
    }

    public JsonResult success(Object data){
        return new JsonResult(true, ResultStatus.SUCCESS,"操作成功",data);
    }

    public JsonResult success(){
        return new JsonResult(true, ResultStatus.SUCCESS,"操作成功",null);
    }

}

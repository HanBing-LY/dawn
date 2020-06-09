package com.xiaoyuan.common.vo.response;

import lombok.Data;

import java.util.List;

@Data
public class PageInfo<T> {

    private List<T> list;

    private long total;
}

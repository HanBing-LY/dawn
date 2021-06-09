package com.xiaoyuan.designpattern.behavioral.chainofresponsibility;

/**
 * @author : cold ice  
 *
 * @date : 2020/9/23 18:23  
 */
public class RequestFrequentHandler extends Handler {

    public RequestFrequentHandler(Handler next) {
        super(next);
    }

    @Override
    boolean process(Request request) {

        System.out.println("访问频率控制.");
        if (request.isFrequentOk()) {
            Handler next = getNext();
            if (null == next) {
                return true;
            }
            return next.process(request);
        }
        return false;
    }
}

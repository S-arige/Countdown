package com.arige.updateversion.listener;

/**
 * Created by songjunjun on 2017/11/22.
 */

public interface UpdateResultListenerimpl {

    //必须更新
    void mustUpdate(String targetUrl);

    //没有更新需求
    void notUpdate();

    //提醒更新
    void notifyUpdate(String targetUrl);

    void onError(String errMsg);
}

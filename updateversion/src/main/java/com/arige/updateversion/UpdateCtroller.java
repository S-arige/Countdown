package com.arige.updateversion;

import com.arige.updateversion.listener.UpdateResultListenerimpl;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

/**
 * Created by songjunjun on 2017/11/22.
 */

public class UpdateCtroller {

    private UpdateResultListenerimpl mListenerimpl;

    private static class SingletonHolder {
        private static final UpdateCtroller INSTANCE = new UpdateCtroller();
    }

    private UpdateCtroller() {
    }

    public static final UpdateCtroller getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void setUpdateListener(UpdateResultListenerimpl listenerimpl){
        mListenerimpl = listenerimpl;
    }

    public void checkUpdate(int versionCode,String versionName){
        RequestParams params = new RequestParams(UpdateContanst.UPDATE_ROOT_URL);
        params.addQueryStringParameter("versionCode",versionCode+"");
        params.addQueryStringParameter("versionName",versionName);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {

            }
            //请求异常后的回调方法
            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
            }
            //主动调用取消请求的回调方法
            @Override
            public void onCancelled(CancelledException cex) {
            }
            @Override
            public void onFinished() {
            }
        });
    }
}

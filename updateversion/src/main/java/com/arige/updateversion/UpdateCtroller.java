package com.arige.updateversion;

import com.arige.updateversion.listener.UpdateResultListenerimpl;

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

    }
}

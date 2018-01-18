package shadows.android.shadowswalker;

import android.content.Context;

import com.xuhao.android.libsocket.sdk.OkSocket;

import cn.xuhao.android.lib.BaseApplication;


/**
 * Created by xuhao on 2017/5/22.
 */

public class MyApplication extends BaseApplication {

    private static MyApplication mApplication;

    @Override
    protected void initOnMainProcess() {
        OkSocket.initialize(this, true);

    }

    @Override
    protected void initAlways() {
        mApplication = this;
    }

    @Override
    protected void initOnOtherProcess(String s, int i) {

    }

    public static Context getApplication() {
        return mApplication;
    }
}

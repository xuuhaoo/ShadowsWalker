package shadows.android.shadowswalker.dao;


import shadows.android.shadowswalker.MyApplication;
import shadows.android.shadowswalker.dao.green.DaoMaster;
import shadows.android.shadowswalker.dao.green.DaoSession;

/**
 * @author yexiuliang
 */

public class GreenDaoManager {
    private static GreenDaoManager Instance;
    private DaoSession mDaoSession;

    private GreenDaoManager() {
        //创建一个数据库
        MySQLiteOpenHelper helper = new MySQLiteOpenHelper(MyApplication.getApplication(), "walker_core_db", null);
        DaoMaster mDaoMaster = new DaoMaster(helper.getWritableDatabase());

        mDaoSession = mDaoMaster.newSession();
    }

    public static GreenDaoManager getInstance() {
        if (Instance == null) {
            synchronized (GreenDaoManager.class) {
                if (Instance == null) {
                    Instance = new GreenDaoManager();
                }
            }
        }
        return Instance;
    }

    public DaoSession getSession() {
        return mDaoSession;
    }
}

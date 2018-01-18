package shadows.android.shadowswalker.db;

import org.greenrobot.greendao.annotation.Entity;

import java.text.SimpleDateFormat;

@Entity
public class LogBean {

    public String time;

    public String log;

    public LogBean(long time, String log) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.time = format.format(time);
        this.log = log;
    }
}
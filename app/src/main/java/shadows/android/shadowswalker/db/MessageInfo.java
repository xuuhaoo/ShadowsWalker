package shadows.android.shadowswalker.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by xuhao on 2017/10/29.
 */
@Entity
public class MessageInfo {

    private String message;

    private String fromWho;

    private String receivedDate;

    @Generated(hash = 1433504138)
    public MessageInfo(String message, String fromWho, String receivedDate) {
        this.message = message;
        this.fromWho = fromWho;
        this.receivedDate = receivedDate;
    }

    @Generated(hash = 1292770546)
    public MessageInfo() {
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFromWho() {
        return this.fromWho;
    }

    public void setFromWho(String fromWho) {
        this.fromWho = fromWho;
    }

    public String getReceivedDate() {
        return this.receivedDate;
    }

    public void setReceivedDate(String receivedDate) {
        this.receivedDate = receivedDate;
    }
}

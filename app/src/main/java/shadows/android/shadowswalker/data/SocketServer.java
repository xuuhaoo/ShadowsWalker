package shadows.android.shadowswalker.data;

import java.io.Serializable;

/**
 * Created by xuhao on 2017/10/29.
 */

public class SocketServer implements Serializable {
    private String ip;

    private int port;

    public String getIp() {
        return ip;
    }

    public SocketServer setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public int getPort() {
        return port;
    }

    public SocketServer setPort(int port) {
        this.port = port;
        return this;
    }
}

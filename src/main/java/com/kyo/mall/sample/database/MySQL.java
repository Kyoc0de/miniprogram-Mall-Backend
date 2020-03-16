package com.kyo.mall.sample.database;

import com.kyo.mall.sample.IConnect;

public class MySQL implements IConnect {

    private String ip = "localhost";

    private Integer port = 3306;

    public MySQL(String ip, Integer port) {
        this.ip = ip;
        this.port = port;
    }

    public MySQL() {
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public void connect() {

    }
}

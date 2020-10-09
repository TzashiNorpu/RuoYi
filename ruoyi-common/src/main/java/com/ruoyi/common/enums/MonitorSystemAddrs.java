package com.ruoyi.common.enums;

public enum MonitorSystemAddrs {
    NET_ADDR("127.0.0.1:8080/test","超级网银地址");
    private final String addr;
    private final String info;

    MonitorSystemAddrs(String addr, String info) {
        this.addr = addr;
        this.info = info;
    }

    public String getAddr() {
        return addr;
    }

    public String getInfo() {
        return info;
    }

}

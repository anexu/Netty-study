package com.xutao.netty.privateProtocol.message;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tau Hsu on 2017/6/18.
 */
public final class Header {
    private int crcCode = 0xabef0101;
    private int length;//消息长度
    private long sessionID;//会话ID
    private byte type;//消息类型
    private byte priority;//消息优先级
    private Map<String,Object>  attchment = new HashMap<String, Object>();//附件

    public final int getCrcCode() {
        return crcCode;
    }

    public final int getLength() {
        return length;
    }

    public final long getSessionID() {
        return sessionID;
    }

    public final byte getType() {
        return type;
    }

    public final byte getPriority() {
        return priority;
    }

    public final Map<String, Object> getAttchment() {
        return attchment;
    }

    public final void setCrcCode(int crcCode) {
        this.crcCode = crcCode;
    }

    public final void setLength(int length) {
        this.length = length;
    }

    public final void setSessionID(long sessionID) {
        this.sessionID = sessionID;
    }

    public final void setType(byte type) {
        this.type = type;
    }

    public final void setPriority(byte priority) {
        this.priority = priority;
    }

    public final void setAttchment(Map<String, Object> attchment) {
        this.attchment = attchment;
    }

    @Override
    public String toString() {
        return "Header{" +
                "crcCode=" + crcCode +
                ", length=" + length +
                ", sessionID=" + sessionID +
                ", type=" + type +
                ", priority=" + priority +
                ", attchment=" + attchment +
                '}';
    }
}

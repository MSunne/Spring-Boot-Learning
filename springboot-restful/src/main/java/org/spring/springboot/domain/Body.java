package org.spring.springboot.domain;

public class Body {
    private String deviceID;
    private String checkCode;
    private Detection[] checkitemData;

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    public Detection[] getCheckitemData() {
        return checkitemData;
    }

    public void setCheckitemData(Detection[] checkitemData) {
        this.checkitemData = checkitemData;
    }
}

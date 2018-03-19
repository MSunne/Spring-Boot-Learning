package org.spring.springboot.domain;

public class DetecTionUser {
    private static final long serialVersionUID = -1L;

    /**
     * 城市编号
     */
    private Long id;

    private String patientName;
    private String checkCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }
}

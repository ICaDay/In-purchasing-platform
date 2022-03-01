package com.mall.entity;/*
    @author Administrator
    @create 2021-09-14 16:26
*/

public class log {
    private Integer log_id;
    private String log_name;
    private String log_time;
    private String operating_content;
    private Integer status;
    private String operating_name;

    public String getOperating_name() {
        return operating_name;
    }

    public void setOperating_name(String operating_name) {
        this.operating_name = operating_name;
    }

    public Integer getLog_id() {
        return log_id;
    }

    public void setLog_id(Integer log_id) {
        this.log_id = log_id;
    }

    public String getLog_name() {
        return log_name;
    }

    public void setLog_name(String log_name) {
        this.log_name = log_name;
    }

    public String getLog_time() {
        return log_time;
    }

    public void setLog_time(String log_time) {
        this.log_time = log_time;
    }

    public String getOperating_content() {
        return operating_content;
    }

    public void setOperating_content(String operating_content) {
        this.operating_content = operating_content;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "log{" +
                "log_id=" + log_id +
                ", log_name='" + log_name + '\'' +
                ", log_time='" + log_time + '\'' +
                ", operating_content='" + operating_content + '\'' +
                ", status=" + status +
                ", operating_name='" + operating_name + '\'' +
                '}';
    }
}

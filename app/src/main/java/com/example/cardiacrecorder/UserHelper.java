package com.example.cardiacrecorder;

public class UserHelper {
    private String systol;
    private String diastol;
    private String puls;
    private String date;
    private String time;
    public UserHelper(){

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDiastol() {
        return diastol;
    }

    public void setDiastol(String diastol) {
        this.diastol = diastol;
    }

    public String getPuls() {
        return puls;
    }

    public void setPuls(String pul) {
        this.puls = puls;
    }

    public String getSystol() {
        return systol;
    }

    public void setSystol(String systol) {
        this.systol = systol;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

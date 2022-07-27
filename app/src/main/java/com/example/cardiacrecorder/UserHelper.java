package com.example.cardiacrecorder;

/**
 * creating user helper class for pushing data into firebase database
 */

public class UserHelper {

    /**
     * declaring the variables for data input
     */
    public String systol;
    public String diastol;
    public String puls;
    public String date;
    public String time;
    public String comment;

    /**
     * declaring getter setter
     * @return
     */

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

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

    public void setPuls(String puls) {
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

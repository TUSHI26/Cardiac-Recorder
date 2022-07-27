package com.example.cardiacrecorder;


/**
 * creating add measure class for adding the value  of variables from input
 */
public class addMeasure {
    String Date, Time, systolic, diastolic,pulse , comment;

    public addMeasure() {
    }

    public addMeasure(String date, String time, String systolic, String diastolic, String pulse, String comment) {
        Date = date;
        Time = time;
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.pulse = pulse;
        this.comment = comment;
    }

    /**
     * creating getter setter for the variables
     * @return
     */
    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getSystolic() {
        return systolic;
    }

    public void setSystolic(String systolic) {
        this.systolic = systolic;
    }

    public String getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(String diastolic) {
        this.diastolic = diastolic;
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

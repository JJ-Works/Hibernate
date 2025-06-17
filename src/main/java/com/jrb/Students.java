package com.jrb;

import jakarta.persistence.Entity;

@Entity
public class Students {
    private int sID;
    private String sName;
    private String sTech;

    public String getsTech() {
        return sTech;
    }

    public void setsTech(String sTech) {
        this.sTech = sTech;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsID() {
        return sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }

    // The toString method provides a string representation fot eh students object. It is useful for debugging,logging,
    // or displaying objects information in a readable format. When you print an instance of Students, this method
    // determines what gets shown.


    @Override
    public String toString() {
        return "Students{" +
                "sID=" + sID +
                ", sName='" + sName + '\'' +
                ", sTech='" + sTech + '\'' +
                '}';
    }
}

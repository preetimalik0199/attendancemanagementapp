package com.example.myapplication.model;

import android.media.Image;

public class listmodel {

    private String userName;
    private int imgid;

    public listmodel(String userName, int imgid) {
        this.userName = userName;
        this.imgid = imgid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}


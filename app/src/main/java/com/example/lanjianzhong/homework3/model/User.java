package com.example.lanjianzhong.homework3.model;

/**
 * Created by lanjianzhong on 2018/4/5.
 */

public class User {
    private int mPicture;
    private String mName;
    private String mId;
    public  User(int picture,String title,String content){
        this.mPicture = picture;
        this.mName = title;
        this.mId = content;
    }
    public int getPicture() {
        return mPicture;
    }
    public void setPicture(int mPicture) {
        this.mPicture = mPicture;
    }
    public String getmName() {
        return mName;
    }
    public void setmName(String mName) {
        this.mName = mName;
    }
    public String getmId() {
        return mId;
    }
    public void setmId(String mContent) {
        this.mId = mContent;
    }


}

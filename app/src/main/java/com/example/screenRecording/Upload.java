package com.example.screenRecording;

public class Upload {
    private String mName;
    private String mVideoUrl;

    public Upload() {
        //empty constructor needed
    }

    public Upload(String name, String videoUrl) {
        if (name.trim().equals("")) {
            name = "No Name";
        }

        mName = name;
        mVideoUrl = videoUrl;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getmVideoUrlUrl() {
        return mVideoUrl;
    }

    public void setmVideoUrl(String videoUrl) {
        mVideoUrl = videoUrl;
    }
}

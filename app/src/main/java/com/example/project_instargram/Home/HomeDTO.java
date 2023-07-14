package com.example.project_instargram.Home;

import java.io.Serializable;

public class HomeDTO implements Serializable {
    private int imgRes;
    private String id;

    public HomeDTO(int imgRes, String id) {
        this.imgRes = imgRes;
        this.id = id;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

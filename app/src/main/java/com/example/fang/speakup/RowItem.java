package com.example.fang.speakup;

import java.io.Serializable;

/**
 * Created by yuen on 28.01.17.
 */

public class RowItem implements Serializable {
    private int imageId;

    public RowItem(int imageId) {
        this.imageId = imageId;
    }

    public int getImageId() {
        return imageId;
    }

}
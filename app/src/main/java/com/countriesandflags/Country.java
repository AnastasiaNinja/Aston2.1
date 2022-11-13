package com.countriesandflags;

public class Country {
    private final int imageId;
    private final String title;

    public Country(int imageId, String title) {
        this.imageId = imageId;
        this.title = title;
    }

    public int getImageId() {
        return imageId;
    }

    public String getTitle() {
        return title;
    }
}

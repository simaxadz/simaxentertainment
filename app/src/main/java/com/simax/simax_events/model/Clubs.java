package com.simax.simax_events.model;

public class Clubs {

    public Clubs() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String image;

    public Clubs(String name, String image){
        this.image = image;
        this.name = name;
    }
}

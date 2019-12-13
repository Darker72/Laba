package com.example.myapplication;

public class Tovar {

    private String name; // название
    private String opisanie;  // столица
    private int image; // ресурс флага

    public Tovar(String name, String opisanie, int flag) {

        this.name = name;
        this.opisanie = opisanie;
        this.image = flag;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpisanie() {
        return this.opisanie;
    }

    public void setOpisane(String capital) {
        this.opisanie = capital;
    }

    public int getImage() {
        return this.image;
    }

    public void setImage(int flagResource) {
        this.image = flagResource;
    }
}

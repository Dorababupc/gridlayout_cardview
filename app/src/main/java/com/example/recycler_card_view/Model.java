package com.example.recycler_card_view;

public class Model {
    private int image;
    private String top;
    private String below;
    public Model(String below,String top,int image){
        this.image=image;
        this.top=top;
        this.below=below;
    }

    public Model() {

    }

    public void setBelow(String below) {
        this.below = below;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public int getImage() {
        return image;
    }

    public String getBelow() {
        return below;
    }

    public String getTop() {
        return top;
    }
}

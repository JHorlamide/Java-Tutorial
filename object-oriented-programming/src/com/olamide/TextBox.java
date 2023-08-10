package com.olamide;

public class TextBox extends UIControl {
    private String text = "";

    public TextBox() {
        super(true);
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    public void clearText() {
        this.text = "";
    }
}

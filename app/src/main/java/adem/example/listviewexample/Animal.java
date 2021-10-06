package adem.example.listviewexample;

public class Animal {
    private String type;
    private int picID;

    public Animal(String type, int picID) {
        this.type = type;
        this.picID = picID;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPicID(int picID) {
        this.picID = picID;
    }

    public String getType() {
        return type;
    }

    public int getPicID() {
        return picID;
    }
}

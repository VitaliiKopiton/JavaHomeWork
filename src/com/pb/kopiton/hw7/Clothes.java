package com.pb.kopiton.hw7;

public class Clothes {
    protected Size size;
    protected int price;
    protected String colour;

    public Clothes(Size size, int price, String colour) {
        this.size = size;
        this.price = price;
        this.colour = colour;
    }

    public Size getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;

    }
    public String getInfo() {
        return "размер" + size.name() + " " + size.getEuroSize() + " " + size.getDescription() + " цвет " + colour + " цена " + price;
    }

}

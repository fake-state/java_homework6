

public class Notebook {
    String manufacturer;
    String model;
    String color;
    int RAM;
    int SSD;
    String os;
    int diagonal;
    int price;

    public Notebook(String manufacturer, String model, String color, int RAM, int SSD, String os, int diagonal, int price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.RAM = RAM;
        this.SSD = SSD;
        this.os = os;
        this.diagonal = diagonal;
        this.price = price;
    }

    public Notebook(String manufacturer, String model, int price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getOs() {
        return color;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public int getPrice() {
        return price;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int ram) {
        RAM = ram;
    }

    public int getSSD() {
        return SSD;
    }

    public void setSSD(int ssd) {
        SSD = ssd;
    }

    @Override
    public String toString() {
        return String.format("%s %s \nОЗУ: %dГБ \nSSD: %dГБ \nэкран: %d\" \nцвет: %s \nОС: %s \nцена: %d\n\n",
                manufacturer, model, RAM, SSD, diagonal, color, os, price);
    }

}
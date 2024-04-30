package net.hiperdino.products;

public class Product {
    private String name;
    private float price;
    private int idProduct;

    public Product() {
    }

    public Product(String name, float price, int idProduct) {
        this.name = name;
        this.price = price;
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
}

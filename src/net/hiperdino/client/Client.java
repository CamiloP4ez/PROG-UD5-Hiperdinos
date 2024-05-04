package net.hiperdino.client;

import java.util.Stack;

import net.hiperdino.products.Product;

public class Client {
    private int id;
    private String name;

    Stack<Product> shopCart = new Stack<>();

    public Client(int id, String name, Stack<Product> shopCart) {
        this.id = id;
        this.name = name;
        this.shopCart = shopCart;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stack<Product> getShopCart() {
        return shopCart;
    }

    public void setShopCart(Stack<Product> shopCart) {
        this.shopCart = shopCart;
    }

    @Override
    public String toString() {
        return "Client [id=" + id + ", name=" + name + ", shopCart=" + shopCart + "]";
    }

}

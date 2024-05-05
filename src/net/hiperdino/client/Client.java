package net.hiperdino.client;

// import java.lang.reflect.Array;
import java.util.ArrayList;
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

    public String getShopCart() {
        String shopItems = "";
        ArrayList<Product> arrayList = new ArrayList<>(shopCart);
        // String[] array = shopCart.toArray(new String[shopCart.size()]);
        for (Product product : arrayList) {
            shopItems += "\t" + product.getName() + "\n";
        }
        return shopItems;
    }

    public void setShopCart(Stack<Product> shopCart) {
        this.shopCart = shopCart;
    }

    public float calculateInvoice() {
        float total = 0f;
        for (int i = 0; i < shopCart.size(); i++) {
            total += shopCart.pop().getPrice();

        }
        return total;
    }

    @Override
    public String toString() {
        // String clientes = "";

        // for (int i = 0; i < shopCart.size(); i++) {
        // total += shopCart.pop().getPrice();

        // }

        return """
                ====================================
                Nombre: %s
                Id: %d
                Cesta:
                %s====================================
                """.formatted(name, id, getShopCart());
    }

}

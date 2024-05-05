package net.hiperdino.cashier;

import java.util.LinkedList;
import java.util.Queue;

import net.hiperdino.client.Client;

public class Cashier {
    private int caashierNumber;
    private String name;
    private Queue<Client> clients = new LinkedList<>();

    public Cashier(int caashierNumber, String name, Queue<Client> clients) {
        this.caashierNumber = caashierNumber;
        this.name = name;
        this.clients = clients;
    }

    public int getCaashierNumber() {
        return caashierNumber;
    }

    public void setCaashierNumber(int caashierNumber) {
        this.caashierNumber = caashierNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Queue<Client> getClients() {
        return clients;
    }

    public void setClients(Queue<Client> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Cashier [caashierNumber=" + caashierNumber + ", name=" + name + ", clients=" + clients + "]";
    }

}

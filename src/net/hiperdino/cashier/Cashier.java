package net.hiperdino.cashier;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import net.hiperdino.client.Client;

public class Cashier {
    private int caashierNumber;
    private String name;
    private Queue<Client> clients = new LinkedList<>();
    private Boolean isOpen = false;

    public Cashier(int caashierNumber, String name) {
        this.caashierNumber = caashierNumber;
        this.name = name;
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

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
        System.out.println("La caja esta abierta");
    }

    public void addClient(Client client) {
        if (isOpen) {
            clients.add(client);
            System.out.println("Cliente añadido");
        } else {
            System.out.println("caja cerrada");
        }
    }

    public void serveCustomer() {
        if (clients.isEmpty()) {
            System.out.println("no quedan clientes por atender\n");

        } else {

            Client client = clients.poll();

            System.out
                    .println(
                            "atendiendo a: \n" + client.toString() + " el total es: " + client.calculateInvoice()
                                    + " euros\n");

        }
    }

    public String getClientsNames() {
        String names = "";
        ArrayList<Client> nameClients = new ArrayList<>(clients);
        for (Client client : nameClients) {
            names += "\t" + client.getName() + " \n";

        }
        return names;
    }

    public Boolean isEmpty() {
        if (clients.isEmpty()) {
            return true;

        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "===========================================" + "\nCajero numero: " + caashierNumber + "\nnombre: "
                + name + "\nclientes:\n" +
                getClientsNames() +
                "\n ===========================================";
    }

}

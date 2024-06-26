package net.hiperdino.utils;

import java.util.Random;
import java.util.Stack;

import net.hiperdino.client.Client;
import net.hiperdino.products.Product;

public class RandomGenerator {
    final static Random R = new Random();
    private static int count = 0;

    private final static String[] NAMES = {
            "Ana",
            "Juan",
            "María",
            "Carlos",
            "Laura",
            "David",
            "Sandra",
            "José",
            "Patricia",
            "Francisco",
            "Cristina",
            "Ramón",
            "Isabel",
            "Luis",
            "Andrea",
            "Pedro",
            "Marta",
            "Antonio",
            "Clara",
            "Alejandro",
            "Eva",
            "Diego",
            "Raquel",
            "Pablo",
            "Vanessa",
            "Jesús",
            "Adrián",
            "Sonia",
            "Miguel",
            "Elena"
    };

    // private static String[] productNames = {
    // "Jabón (Higiene)",
    // "Champú (Higiene)",
    // "Pasta de dientes (Higiene)",
    // "Papel higiénico (Higiene)",
    // "Toallas de papel (Higiene)",
    // "Detergente (Hogar)",
    // "Suavizante (Hogar)",
    // "Esponja (Hogar)",
    // "Bolsas de basura (Hogar)",
    // "Limpiador multiusos (Hogar)",
    // "Leche (Alimento)",
    // "Pan (Alimento)",
    // "Huevos (Alimento)",
    // "Fruta (Alimento)",
    // "Verdura (Alimento)",
    // "Carne (Alimento)",
    // "Pescado (Alimento)",
    // "Arroz (Alimento)",
    // "Pasta (Alimento)",
    // "Legumbres (Alimento)"
    // };
    private final static Product[] PRODUCTS = {
            new Product("jabon", 5.4f, 1),
            new Product("champu", 3.4f, 2),
            new Product("Pasta de dientes", 2.4f, 3),
            new Product("Papel higienico", 1.4f, 4),
            new Product("Toallas de papel", 22.4f, 5),
            new Product("Detergente", 12.4f, 6),
            new Product("Suavizante", 2.34f, 7),
            new Product("Esponja", 25.4f, 8),
            new Product("Bolsas de basura", 5.4f, 9),
            new Product("Limpiador Multiusos", 6.4f, 10),
            new Product("leche", 4.4f, 11),
            new Product("pan", 2.4f, 12),
            new Product("huevos", 2.4f, 13),
            new Product("fruta", 2.4f, 14),
            new Product("verdura", 2.4f, 15),
            new Product("Carne", 2.4f, 16),
            new Product("Pescado", 2.4f, 17),
            new Product("Arroz", 2.4f, 18),
            new Product("Pasta", 2.4f, 19),
            new Product("Legumbres", 2.4f, 20)
    };

    public static int generateRandom() {

        int random = R.nextInt(20);
        return random;
    }

    public static Product productGenerator() {
        int randomIndex = generateRandom();
        return PRODUCTS[randomIndex];
    }

    public static String nameGenerator() {
        int randomIndex = generateRandom();
        return NAMES[randomIndex];
    }

    public static Stack<Product> shopsGenerator() {
        Stack<Product> shopCart = new Stack<>();
        for (int i = 0; i < generateRandom(); i++) {
            shopCart.push(productGenerator());
        }

        return shopCart;
    }

    public static Client generateClient() {
        Client client = new Client(count, nameGenerator(), shopsGenerator());
        count++;

        return client;
    }

}

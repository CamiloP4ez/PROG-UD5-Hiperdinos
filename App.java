import java.util.Scanner;

import net.hiperdino.cashier.Cashier;
import net.hiperdino.menu.Menu;
import net.hiperdino.utils.RandomGenerator;

public class App {
    public static void main(String[] args) {
        // System.out.println(Menu.printMenu());
        Scanner kb = new Scanner(System.in);
        Boolean keepAsking = true;
        int option = 0;
        Cashier cashier = new Cashier(1, RandomGenerator.nameGenerator());

        while (keepAsking) {
            while (keepAsking) {
                System.out.println(Menu.printMenu());
                try {
                    option = Integer.parseInt(kb.nextLine());
                    keepAsking = false;
                } catch (NumberFormatException e) {
                    System.out.println("La cadena no representa un número válido.");
                    keepAsking = true;
                    System.out.println(Menu.printMenu());
                }

            }

            keepAsking = true;

            switch (option) {
                case 1:
                    cashier.setIsOpen(true);
                    break;
                case 2:
                    cashier.addClient(RandomGenerator.generateClient());
                    break;

                case 3:
                    cashier.serveCustomer();
                    break;

                case 4:
                    System.out.println(cashier.toString());

                    break;
                case 5:
                    if (cashier.isEmpty()) {
                        System.out.println("Cerrando el supermercado");
                        keepAsking = false;
                    } else {
                        System.out.println("aun quedan clientes por atender wacho");
                    }
                    break;
                default:
                    break;
            }
        }

        kb.close();
    }
}

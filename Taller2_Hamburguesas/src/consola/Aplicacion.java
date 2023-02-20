package consola;

import java.util.Scanner;

import procesamiento.Restaurante;

public class Aplicacion {
    private static Scanner scanner = new Scanner(System.in);
    private static Restaurante restaurante = new Restaurante();

    public static void main(String[] args) {
        restaurante.loadMenu();
        restaurante.loadCombos();
        restaurante.loadIngredients();
        int option;

        do {
            printMenu();
            option = scanner.nextInt();
            scanner.nextLine(); // consume the newline character after reading the integer input

            switch (option) {
                case 1:
                    restaurante.showMenu();
                    break;
                case 2:
                    restaurante.startNewOrder(getNombreCliente(), getDireccionCliente());
                    break;
                case 3:
                    restaurante.addItemToOrder();
                    break;
                case 4:
                    restaurante.closeOrder();
                    break;
                case 5:
                    restaurante.getOrderInfo();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (option != 6);
    }

 
	private static String getNombreCliente() {
        System.out.print("Enter client name: ");
        return scanner.nextLine();
    }

    private static String getDireccionCliente() {
        System.out.print("Enter client address: ");
        return scanner.nextLine();
    }

    private static void printMenu() {
        System.out.println("Welcome to the Hamburger Restaurant!");
        System.out.println("Choose an option:");
        System.out.println("1. Show the menu");
        System.out.println("2. Start a new order");
        System.out.println("3. Add an item to an order");
        System.out.println("4. Close an order and save the invoice");
        System.out.println("5. Consult the information of an order given its ID");
        System.out.println("6. Exit");
    }
}

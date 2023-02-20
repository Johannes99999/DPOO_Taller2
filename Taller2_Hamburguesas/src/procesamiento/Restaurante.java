package procesamiento;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import modelo.ProductoAjustado;
import modelo.Combo;
import modelo.Ingrediente;
import modelo.Producto;
import modelo.ProductoMenu;

public class Restaurante {
    private ArrayList<ProductoMenu> menu;
    private ArrayList<Combo> combos;
    private HashMap<String, Double> ingredients;
    private ArrayList<Producto> currentOrder;

    public void loadMenu() {
        menu = new ArrayList<ProductoMenu>();
        try {
            File menuFile = new File("../data/menu.txt");
            Scanner scanner = new Scanner(menuFile);
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(";");
                menu.add(new ProductoMenu(line[0], (int) Double.parseDouble(line[1])));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Menu file not found.");
        }
    }

    public void loadCombos() {
        combos = new ArrayList<Combo>();
        try {
            File comboFile = new File("../data/combos.txt");
            Scanner scanner = new Scanner(comboFile);
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(";");
                Producto baseProduct = getProductByName(line[1]);
                ArrayList<Producto> products = new ArrayList<Producto>();
                products.add(baseProduct);
                for (int i = 2; i < line.length; i++) {
                    if (!line[i].equals("")) {
                        Producto product = getProductByName(line[i]);
                        if (product != null) {
                            products.add(product);
                        }
                    }
                }
                Combo combo = new Combo
                		
            }
            } catch (FileNotFoundException e) {
                System.out.println("Error: Menu file not found.");
            } 
        }

	public void loadIngredients() {
		// TODO Auto-generated method stub
		
	}

	public void showMenu() {
		// TODO Auto-generated method stub
		
	}

	public void startNewOrder(String nombreCliente, String direccionCliente) {
		// TODO Auto-generated method stub
		
	}

	public void addItemToOrder() {
		// TODO Auto-generated method stub
		
	}

	public void closeOrder() {
		// TODO Auto-generated method stub
		
	}

	public void getOrderInfo() {
		// TODO Auto-generated method stub
		
	}
    }

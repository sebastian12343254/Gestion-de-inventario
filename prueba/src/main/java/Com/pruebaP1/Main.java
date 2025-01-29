package Com.pruebaP1;

import java.util.Scanner;

public class Main {
    static final Scanner scanner = new Scanner(System.in);
    static final Inventary inventary = new Inventary();

    private static int id;
    private static String name;
    private static double price;
    private static int quantity;
    public static void main(String[] args) {
        int option = 1;
        
        do{
        System.out.println("Bienvenido a la tienda, que desea hacer?");
        System.out.println("0. Salir");
        System.out.println("1. Agregar producto");
        System.out.println("2. Eliminar producto");
        System.out.println("3. Actualizar producto");
        System.out.println("4. Obtener producto");
        System.out.println("5. Mostrar productos");

        option = scanner.nextInt();
        scanner.nextLine();
            switch (option) {
           
                case 1:
                    addProduct();
                    break;
    
                case 2:
                    removeProduct();
                    break;
    
                case 3:
                    updateProduct();
                    break;
    
                case 4:
                   getProduct();
                case 5:
                    inventary.showProducts();
                    break;
                default:
                System.out.println("Opcion no valida");
                    break;
            }
        }while(option != 0);
        
        scanner.close();
    }

    private static void addProduct(){
        System.out.println("Para crear el producto, ingrese el ID: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("ingrese el nombre: ");
        name = scanner.nextLine();
        System.out.println("ingrese el precio: ");
        price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("ingrese la cantidad: ");
        quantity = scanner.nextInt();
        scanner.nextLine();

        Product producto = new Product(id, name, price, quantity);
        inventary.addProduct(producto);
    }

    private static void removeProduct(){
        System.out.println("Ingrese el ID del producto que desea eliminar: ");
        id = scanner.nextInt();
        inventary.removeProduct(id);
    }

    private static void updateProduct(){
        System.out.println("Cree el producto a añadir, ingrese el ID: ");
        id = scanner.nextInt();
        System.out.println("ingrese el nombre: ");
        name = scanner.nextLine();
        System.out.println("ingrese el precio: ");
        price = scanner.nextDouble();
        System.out.println("ingrese la cantidad: ");
        quantity = scanner.nextInt();
        Product producto = new Product(id, name, price, quantity);
        inventary.updateProduct(producto, id);
    }

    private static void getProduct(){
        System.out.println("Ingrese el ID del producto que desea obtener: ");
        id = scanner.nextInt();
        inventary.getProduct(id);
    }

}

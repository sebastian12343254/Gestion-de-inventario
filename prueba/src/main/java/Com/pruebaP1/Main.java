package Com.pruebaP1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        Inventary inventary = new Inventary();
        Product product = new Product();

        System.out.println("Bienvenido a la tienda, que desea hacer?");
        System.out.println("Agregar producto");
        System.out.println("Eliminar producto");
        System.out.println("Actualizar producto");
        System.out.println("Obtener producto");
        System.out.println("Mostrar productos");

        String option = scanner.nextLine();
        switch (option) {
           
            case "Agregar producto":
                System.out.println("Para crear el producto, ingrese el ID: ");
                int id = scanner.nextInt();
                System.out.println("ingrese el nombre: ");
                String name = scanner.nextLine();
                System.out.println("ingrese el precio: ");
                double price = scanner.nextDouble();
                System.out.println("ingrese la cantidad: ");
                int quantity = scanner.nextInt();

                product.setId(id);
                product.setName(name);
                product.setPrice(price);
                product.setQuantity(quantity);
                product.product(id, name, price, quantity);

                inventary.addProduct(product);

                break;

            case "Eliminar producto":
                System.out.println("Ingrese el ID del producto que desea eliminar: ");
                id = scanner.nextInt();
                inventary.removeProduct(id);
                break;

            case "Actualizar producto":
                System.out.println("Cree el producto a añadir, ingrese el ID: ");
                id = scanner.nextInt();
                System.out.println("ingrese el nombre: ");
                name = scanner.nextLine();
                System.out.println("ingrese el precio: ");
                price = scanner.nextDouble();
                System.out.println("ingrese la cantidad: ");
                quantity = scanner.nextInt();

                product.setId(id);
                product.setName(name);
                product.setPrice(price);
                product.setQuantity(quantity);
                product.product(id, name, price, quantity);

                inventary.updateProduct(product, id);
                break;

            case "Obtener producto":
                System.out.println("Ingrese el ID del producto que desea obtener: ");
                id = scanner.nextInt();
                inventary.getProduct(id);
                break;
            case "Mostrar productos":
                inventary.showProducts();
                break;
            default:
                break;
        }
        scanner.close();
    }
}

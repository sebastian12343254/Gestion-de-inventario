package Com.pruebaP1;

import java.util.Scanner;

import main.java.Com.pruebaP1.Exceptions;

public class Main {
    //Declaracion de scanner y creacion de objeto inventary para uso de metodos en clase 
    static final Scanner scanner = new Scanner(System.in);
    static final Inventary inventary = new Inventary();
    static final Exceptions exceptions = new Exceptions();

    //Varieables globales para uso en metodos
    private static int id;
    private static String name;
    private static double price;
    private static int quantity;
    public static void main(String[] args) {
        //se inicializa la variable option en 1 para que entre al bucle
        int option = 1;
        
        //Menu de opciones
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
                
                case 0:
                    System.out.println("¡Gracias por usar el sistema!");
                    break;
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
                    if(inventary.products.isEmpty()){
                        System.out.println("No hay productos en la tienda.");
                    } else {
                    inventary.showProducts();
                    }
                    break;
                default:
                System.out.println("Opcion no valida");
                    break;
            }
        }while(option != 0);
        
        scanner.close();
    }

    //metodos para agregar, eliminar, actualizar y obtener productos
    private static void addProduct(){
        id = exceptions.readInt("Para crear el producto, ingrese el ID:");
        System.out.print("ingrese el nombre: ");
        name = exceptions.readString(scanner.nextLine());
        price = exceptions.readDouble("ingrese el precio:");
        quantity = exceptions.readInt("ingrese la cantidad: ");
        Product producto = new Product(id, name, price, quantity);
        inventary.addProduct(producto);
        System.out.println("Producto agregado correctamente.");
    }

    private static void removeProduct(){
        id = exceptions.readInt("Ingrese el ID del producto que desea eliminar: ");
         try{
                inventary.removeProduct(id);
            }catch(IndexOutOfBoundsException e) {
                System.out.println("Error al eliminar el producto.");
            }
        System.out.println("Producto eliminado correctamente.");
    }

    private static void updateProduct(){
        id = exceptions.readInt("Cree el producto a añadir, ingrese el ID: ");
        System.out.print("ingrese el nombre: ");
        name = exceptions.readString(scanner.nextLine());
        price = exceptions.readDouble("ingrese el precio: ");
        quantity = exceptions.readInt("ingrese la cantidad: ");
        Product producto = new Product(id, name, price, quantity);
        try{
        inventary.updateProduct(producto, id);
        }catch(IndexOutOfBoundsException e) {
            System.out.println("Error al actualizar el producto.");
        }
       
            System.out.println("Producto actualizado correctamente.");  
    }

    private static void getProduct(){   
        try {
            id = exceptions.readInt("Ingrese el ID del producto que desea obtener: ");
            System.out.println(inventary.getProduct(id)); 
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Producto no encontrado.");
        }
          
    }

}

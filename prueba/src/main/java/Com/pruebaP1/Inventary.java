package Com.pruebaP1;

import java.util.ArrayList;

class Inventary {
    //creacion de un arraylist de tipo productos donde se van a almacenar los productos
    ArrayList<Product> products = new ArrayList<Product>();

    //metodo para agregar productos al arraylist
    void addProduct(Product product){
        products.add(product);
    }

    //metodo para eliminar productos del arraylist
    void removeProduct(int id){
        products.remove(id);
    }

    //metodo para actualizar productos del arraylist
    void updateProduct(Product product, int index){
        products.set(index, product);
    }

    //metodo para obtener productos del arraylist
    void getProduct(int index){
        System.out.println(products.get(index));
    }

    //metodo para mostrar los productos del arraylist
    void showProducts(){
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

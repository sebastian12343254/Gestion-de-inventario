package Com.pruebaP1;

//clase producto donde se inicializan los atributos de los productos
class Product {

    private int id; //se declara el id del producto
    private String name; //se declara el nombre del producto
    private double price; //se declara el precio del producto
    private int quantity; //se declara la cantidad del producto

    //contrustor de la clase producto con todas las variables de la clase
    public void product(int id, String name, double price, int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //metodos get y set de las variables de la clase
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    //metodo toString para imprimir los datos de los productos
    @Override
    public String toString() {
        return "Product{" +
            "name='" + name + '\'' +
            ", price=" + price +
            ", quantity=" + quantity +
            '}';
    }
}

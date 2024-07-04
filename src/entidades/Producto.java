package entidades;

public class Producto {
    //atributos de la clase
    private int id;
    private String nomProducto;
    private double precio;
    private int stockActual;


    private Marca marca;

    //metodo constructor, se llama igual que la clase
    public Producto() {
        this.id = -1;
        this.nomProducto = "No especificado";
        this.precio = 0;
        this.stockActual = 0;
        this.marca=new Marca();
    }
    public Producto (int id, String nomProducto){
        this.id=id;
        this.nomProducto=nomProducto;
        this.marca=new Marca();
    }
    public Producto (int id, String nomProducto, double precio, int stockActual){
        this.id=id;
        this.nomProducto=nomProducto;
        this.precio=precio;
        this.stockActual=stockActual;
        this.marca=new Marca();
    }

    //metodos de la clase
    public void mostrarProducto() {
        System.out.println(id + " " + nomProducto + " Precio: $ " + precio + " stock: " + stockActual + " Marca " + marca.toString());
    }

    //set ()void establece el valor para el atributo
    public void setId(int id) {
        this.id = id;
    }

    //this es el puntero hacia la propia clase(atributos y metodos)
    public int getId() {
        return this.id;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public String getNomProducto() {
        return this.nomProducto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public int getStockActual() {
        return this.stockActual;
    }

    //sobrecarga de metodo (se llaman igual, se diferencian en parametros)
    public void actualizarStock() {
        this.stockActual = stockActual + 10;
    }

    public void actualizarStock(int cantidad) {
        this.stockActual = this.stockActual;
    }


}//cierra CLASE

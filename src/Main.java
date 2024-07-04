import entidades.Marca;
import entidades.Producto;

public class Main {
    public static void main(String[] args) {
        //crear un objeto de la clase "Producto"
        //se usa Producto() para crear producto vacio
        //EJEMPLO

        Producto p;
        p = new Producto();

        Producto producto1 = new Producto();
        producto1.setId(1);
        producto1.setNomProducto("Honda...");
        producto1.setPrecio(1500000);
        producto1.setStockActual(1000);
        producto1.mostrarProducto();

        Producto producto2 = new Producto();
        producto2.setNomProducto("Motomel ZZZ");
        producto2.setPrecio(1200000);
        producto2.setId(2);

        producto2.mostrarProducto();

        System.out.println(producto2.getNomProducto());

        producto1.actualizarStock();
        producto1.actualizarStock(5);
        producto1.mostrarProducto();

        Producto producto3 = new Producto();
        producto3.mostrarProducto();

        Producto producto4 = new Producto(4, "Zanella...ZZ");
        producto4.mostrarProducto();

        Producto producto5 = new Producto(5, "Yamaha YY", 2500000, 6);
        producto5.mostrarProducto();
        producto5.setNomProducto("Yamaha ZZ");
        producto5.mostrarProducto();

        //creo un objeto instancia de la marca llamando al
        //constructor con nombre como parametro
        Marca marca1 = new Marca("Zanella");
        marca1.MostrarMarca();

        Marca objMarca = new Marca("Honda");
        objMarca.MostrarMarca();

        objMarca.setNomMarca("Honda cambii");
        objMarca.setId(1);

        System.out.println(objMarca.toString());



    }//cierra MAIN
}//cierra CLASE
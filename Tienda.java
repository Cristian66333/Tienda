import java.util.ArrayList;

public class Tienda {
    private ArrayList<Producto> productos;

    public Tienda(){
        this.productos =  new ArrayList<Producto>();
    }
    public String anhadirProducto(Producto producto){
        productos.add(producto);

        return "Producto añadido exitosamente";
    }
    public String mostrarProductos(){
        String stringProductos="";
        for (int i = 0; i < productos.size(); i++) {
            stringProductos = stringProductos+
            "id = " + productos.get(i).getId() + 
            " Nombre = "+ productos.get(i).getNombre()
            + " Precio = "+productos.get(i).getPrecio()+"\n";
        }
        return stringProductos;
    }
    public Producto actualizarProducto(String id, String nombre, double precio, String unidad){
        for (int i = 0; i < productos.size(); i++) {
            if (id.equals(productos.get(i).getId())) {
                productos.get(i).setNombre(nombre);
                productos.get(i).setPrecio(precio);
                productos.get(i).setUnidad(unidad);
                return productos.get(i);
            }
        }
        return null;
    }
    public Producto elimiProducto(String id){
        for (int i = 0; i < productos.size(); i++) {
            if (id.equals(productos.get(i).getId())) {
                return productos.remove(i);
            }
        }
        return null;
    }
    public Producto agregarIVA(String id){
        for (int i = 0; i < productos.size(); i++) {
            if (id.equals(productos.get(i).getId())) {
                productos.get(i).setPrecio(productos.get(i).getPrecio()+productos.get(i).getPrecio()*0.19);
                return productos.get(i);
            }
        }
        return null;
    }
}

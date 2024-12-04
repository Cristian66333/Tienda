import javax.swing.JOptionPane;

public class Run {
    public static void main(String[] args) {
        String menu = """
                1. crear producto
                2. mostrar productos
                3. actualizar producto
                4. eliminar producto
                5. añadir iva a producto
                6. salir
                """;
        int opcion = 0;

        Tienda tienda = new Tienda();
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion deseada\n"+menu));
            switch (opcion) {
                
                case 1:
                    String id = JOptionPane.showInputDialog("Ingrese el id del producto");
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto");
                    double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto"));
                    String unidad = JOptionPane.showInputDialog("Ingrese la unidad del producto");
                    JOptionPane.showMessageDialog(null,tienda.anhadirProducto(new Producto(id, nombre, precio, unidad)));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,tienda.mostrarProductos());
                    break;
                case 3:
                    String idBuscar = JOptionPane.showInputDialog("Ingrese el id del producto");
                    String nombreNuevo = JOptionPane.showInputDialog("Ingrese el nuevo nombre del producto");
                    double precioNuevo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio del producto"));
                    String unidadNuevo = JOptionPane.showInputDialog("Ingrese la nueva unidad del producto");
                    Producto productoActualizado = tienda.actualizarProducto(idBuscar, nombreNuevo, precioNuevo, unidadNuevo);
                    JOptionPane.showMessageDialog(null,"Nombre = "+productoActualizado.getNombre()+" Precio = "+productoActualizado.getPrecio()+" unidad = "+productoActualizado.getUnidad());
                    break;
                case 4:
                    String idEliminar = JOptionPane.showInputDialog("Ingrese el id del producto");
                    Producto productoEliminado = tienda.elimiProducto(idEliminar);
                    JOptionPane.showMessageDialog(null,"El producto eliminado = "+ "Nombre = "+productoEliminado.getNombre()+" Precio = "+productoEliminado.getPrecio()+" unidad = "+productoEliminado.getUnidad());
                    break;
                case 5:
                    String idIva = JOptionPane.showInputDialog("Ingrese el id del producto");
                    Producto productoIva = tienda.agregarIVA(idIva);
                    JOptionPane.showMessageDialog(null,"Nombre = "+productoIva.getNombre()+" Precio = "+productoIva.getPrecio()+" unidad = "+productoIva.getUnidad());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
                    break;
            }
        } while (opcion != 6);
    }
}


package Modelos;

/**
 *
 * @author Oscar Mendez
 */
public class Entrada {
    String idEntrada;
    String Fecha;
    String idProducto;
    String Producto;
    float Cantidad;
    String Factura;
    String Proveedor;
    int Contador;

    public Entrada(String idEntrada, String Fecha, String idProducto, String Producto, float Cantidad, 
            String Factura, String Proveedor, int Contador) {
        this.idEntrada = idEntrada;
        this.Fecha = Fecha;
        this.idProducto = idProducto;
        this.Producto = Producto;
        this.Cantidad = Cantidad;
        this.Factura = Factura;
        this.Proveedor = Proveedor;
        this.Contador = Contador;
    }

    public String getIdEntrada() {
        return idEntrada;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public String getProducto() {
        return Producto;
    }

    public float getCantidad() {
        return Cantidad;
    }

    public String getFactura() {
        return Factura;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public int getContador() {
        return Contador;
    }

    public void setIdEntrada(String idEntrada) {
        this.idEntrada = idEntrada;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public void setCantidad(float Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setFactura(String Factura) {
        this.Factura = Factura;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    public void setContador(int Contador) {
        this.Contador = Contador;
    }
    
}

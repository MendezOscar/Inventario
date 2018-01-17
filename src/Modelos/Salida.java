
package Modelos;

/**
 *
 * @author Oscar Mendez
 */
public class Salida {
    String idSalida;
    String Fecha;
    String idProducto;
    String Producto;
    float Cantidad;
    String Factura;
    int Contador;

    public Salida(String idEntrada, String Fecha, String idProducto, String Producto, float Cantidad, 
            String Factura, int Contador) {
        this.idSalida = idEntrada;
        this.Fecha = Fecha;
        this.idProducto = idProducto;
        this.Producto = Producto;
        this.Cantidad = Cantidad;
        this.Factura = Factura;
        this.Contador = Contador;
    }

    public String getIdEntrada() {
        return idSalida;
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

    public int getContador() {
        return Contador;
    }

    public void setIdEntrada(String idEntrada) {
        this.idSalida = idEntrada;
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

    public void setContador(int Contador) {
        this.Contador = Contador;
    }
    
}

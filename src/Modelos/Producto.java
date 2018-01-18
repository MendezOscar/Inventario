
package Modelos;

/**
 *
 * @author Oscar Mendez
 */
public class Producto {
    String idProducto;
    String Categotia;
    String Nombre;
    String Descripcion;
    float precio;
    String Ubicacion;
    int contador;

    public Producto(String idProducto, String Categotia, String Nombre, String Descripcion, float precio, 
            String Ubicacion, int contador) {
        this.idProducto = idProducto;
        this.Categotia = Categotia;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.precio = precio;
        this.Ubicacion = Ubicacion;
        this.contador = contador;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public String getCategotia() {
        return Categotia;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public int getContador() {
        return contador;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public void setCategotia(String Categotia) {
        this.Categotia = Categotia;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }
}
            

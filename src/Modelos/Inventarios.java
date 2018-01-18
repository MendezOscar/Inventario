
package Modelos;

/**
 *
 * @author Oscar Mendez
 */
public class Inventarios {
    String idInventario;
    String idProducto;
    String Producto;
    float Existencia;
    int contador;

    public Inventarios(String idInventario, String idProducto, String Producto, float Existencia, int contador) {
        this.idInventario = idInventario;
        this.idProducto = idProducto;
        this.Producto = Producto;
        this.Existencia = Existencia;
        this.contador = contador;
    }

    public String getIdInventario() {
        return idInventario;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public String getProducto() {
        return Producto;
    }

    public float getExistencia() {
        return Existencia;
    }

    public int getContador() {
        return contador;
    }

    public void setIdInventario(String idInventario) {
        this.idInventario = idInventario;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public void setExistencia(float Existencia) {
        this.Existencia = Existencia;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

}

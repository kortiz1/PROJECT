/**
 * Created by root on 16/11/17.
 */

public class Medicamentos {

    private String id;
    private String foto;
    private String nombre;
    private String distribuidora;
    private String tipo;
    private String cantidad;
    private int vencimiento;

    public Medicamentos(String id, String foto, String nombre, String distribuidora, String tipo, String cantidad, int vencimiento) {
        this.id = id;
        this.foto = foto;
        this.nombre = nombre;
        this.distribuidora = distribuidora;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.vencimiento = vencimiento;
    }

    public String getId() {
        return id;
    }

    public String getFoto() {
        return foto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public int getVencimiento() {
        return vencimiento;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setVencimiento(int vencimiento) {
        this.vencimiento = vencimiento;
    }
}

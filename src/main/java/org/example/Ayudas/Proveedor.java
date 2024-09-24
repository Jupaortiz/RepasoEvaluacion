package org.example.Ayudas;

public class Proveedor {
    private Integer id;
    private String nombre;
    private String telefono;
    private String direccion;
    private Integer calificacion;
    private String tipoProducto;
    private Boolean activo;
    private Integer tiempoEntregaDias;
    private String metodoPago;
    private Integer cantidadProductosOfrecidos;

    public Proveedor() {
    }

    public Proveedor(Integer id, String nombre, String telefono, String direccion, Integer calificacion, String tipoProducto, Boolean activo, Integer tiempoEntregaDias, String metodoPago, Integer cantidadProductosOfrecidos) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.calificacion = calificacion;
        this.tipoProducto = tipoProducto;
        this.activo = activo;
        this.tiempoEntregaDias = tiempoEntregaDias;
        this.metodoPago = metodoPago;
        this.cantidadProductosOfrecidos = cantidadProductosOfrecidos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Integer getTiempoEntregaDias() {
        return tiempoEntregaDias;
    }

    public void setTiempoEntregaDias(Integer tiempoEntregaDias) {
        this.tiempoEntregaDias = tiempoEntregaDias;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Integer getCantidadProductosOfrecidos() {
        return cantidadProductosOfrecidos;
    }

    public void setCantidadProductosOfrecidos(Integer cantidadProductosOfrecidos) {
        this.cantidadProductosOfrecidos = cantidadProductosOfrecidos;
    }
}

package org.example.Modelos;

public class Cliente {

    private Integer id;
    private String nombre;
    private String correoElectronico;
    private String telefono;
    private String direccion;
    private Integer edad;
    private Boolean esVip;
    private String fechaRegistro;
    private Integer puntosFidelidad;
    private String metodoPagoPreferido;


    public Cliente() {
    }

    public Cliente(Integer id, String nombre, String correoElectronico, String telefono, String direccion, Integer edad, Boolean esVip, String fechaRegistro, Integer puntosFidelidad, String metodoPagoPreferido) {
        this.id = id;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.direccion = direccion;
        this.edad = edad;
        this.esVip = esVip;
        this.fechaRegistro = fechaRegistro;
        this.puntosFidelidad = puntosFidelidad;
        this.metodoPagoPreferido = metodoPagoPreferido;
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

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Boolean getEsVip() {
        return esVip;
    }

    public void setEsVip(Boolean esVip) {
        this.esVip = esVip;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getPuntosFidelidad() {
        return puntosFidelidad;
    }

    public void setPuntosFidelidad(Integer puntosFidelidad) {
        this.puntosFidelidad = puntosFidelidad;
    }

    public String getMetodoPagoPreferido() {
        return metodoPagoPreferido;
    }

    public void setMetodoPagoPreferido(String metodoPagoPreferido) {
        this.metodoPagoPreferido = metodoPagoPreferido;
    }
}

package org.example.Modelos;

public class Flor {

    private Long id;
    private String nombre;
    private String color;
    private String tipo;
    private String fragancia;
    private Integer petalos;
    private Double altura;
    private Boolean disponibilidad;
    private Integer precio;
    private Integer cantidad;


    public Flor() {
    }

    public Flor(Long id, String nombre, String color, String tipo, String fragancia, Integer petalos, Double altura, Boolean disponibilidad, Integer precio, Integer cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.tipo = tipo;
        this.fragancia = fragancia;
        this.petalos = petalos;
        this.altura = altura;
        this.disponibilidad = disponibilidad;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFragancia() {
        return fragancia;
    }

    public void setFragancia(String fragancia) {
        this.fragancia = fragancia;
    }

    public Integer getPetalos() {
        return petalos;
    }

    public void setPetalos(Integer petalos) {
        this.petalos = petalos;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}

package org.example.Ayudas;

public class Repartidor {
    private Integer id;
    private String nombre;
    private String telefono;
    private String vehiculo;
    private Integer calificacion;
    private Boolean disponibilidad;
    private String zonaCobertura;
    private Integer numEntregas;
    private Integer experienciaAnos;
    private Boolean activo;

    public Repartidor() {
    }

    public Repartidor(Integer id, String nombre, String telefono, String vehiculo, Integer calificacion, Boolean disponibilidad, String zonaCobertura, Integer numEntregas, Integer experienciaAnos, Boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.vehiculo = vehiculo;
        this.calificacion = calificacion;
        this.disponibilidad = disponibilidad;
        this.zonaCobertura = zonaCobertura;
        this.numEntregas = numEntregas;
        this.experienciaAnos = experienciaAnos;
        this.activo = activo;
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

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getZonaCobertura() {
        return zonaCobertura;
    }

    public void setZonaCobertura(String zonaCobertura) {
        this.zonaCobertura = zonaCobertura;
    }

    public Integer getNumEntregas() {
        return numEntregas;
    }

    public void setNumEntregas(Integer numEntregas) {
        this.numEntregas = numEntregas;
    }

    public Integer getExperienciaAnos() {
        return experienciaAnos;
    }

    public void setExperienciaAnos(Integer experienciaAnos) {
        this.experienciaAnos = experienciaAnos;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}

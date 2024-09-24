package org.example.modelos;

import java.time.LocalDate;

public class Flor {
    private Integer id;
    private String nombre;
    private String color;
    private Integer precio;
    private Integer cantidad;
    private boolean espinas;
    private Integer numeroPetalos;
    private LocalDate vencimiento;
    private String culivador;
    private String paisOrigen;

    public Flor() {
    }

    public Flor(Integer id, String nombre, String color, Integer precio, Integer cantidad, boolean espinas, Integer numeroPetalos, LocalDate vencimiento, String culivador, String paisOrigen) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
        this.cantidad = cantidad;
        this.espinas = espinas;
        this.numeroPetalos = numeroPetalos;
        this.vencimiento = vencimiento;
        this.culivador = culivador;
        this.paisOrigen = paisOrigen;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public boolean isEspinas() {
        return espinas;
    }

    public void setEspinas(boolean espinas) {
        this.espinas = espinas;
    }

    public Integer getNumeroPetalos() {
        return numeroPetalos;
    }

    public void setNumeroPetalos(Integer numeroPetalos) {
        this.numeroPetalos = numeroPetalos;
    }

    public LocalDate getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getCulivador() {
        return culivador;
    }

    public void setCulivador(String culivador) {
        this.culivador = culivador;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}

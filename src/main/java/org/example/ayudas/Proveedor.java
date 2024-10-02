package org.example.ayudas;

import java.time.LocalDate;

public class Proveedor {
    private Integer id;
    private String nombre;
    private String producto;
    private String direccion;
    private String ciudad;
    private String departamento;
    private String telefono;
    private String correo;
    private String regimen;
    private LocalDate fechaRegistro;

    public Proveedor() {
    }

    public Proveedor(Integer id, String nombre, String producto, String direccion, String ciudad, String departamento, String telefono, String correo, String regimen, LocalDate fechaRegistro) {
        this.id = id;
        this.nombre = nombre;
        this.producto = producto;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.telefono = telefono;
        this.correo = correo;
        this.regimen = regimen;
        this.fechaRegistro = fechaRegistro;
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

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", producto='" + producto + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", departamento='" + departamento + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", regimen='" + regimen + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                '}';
    }
}

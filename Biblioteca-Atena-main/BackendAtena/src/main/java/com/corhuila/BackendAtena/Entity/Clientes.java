package com.corhuila.BackendAtena.Entity;
import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", length = 200, nullable = false)
    private String nombre;

    @Column(name = "cedula", length = 50, nullable = false)
    private String cedula;

    @Column(name = "telefono", nullable = false)
    private Float telefono;

    @Column(name = "email", length = 100, nullable = false)
    private String email;

    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    public Integer getId() {
        return id;
    }

    // Getters and Setters

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Float getTelefono() {
        return telefono;
    }

    public void setTelefono(Float telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}





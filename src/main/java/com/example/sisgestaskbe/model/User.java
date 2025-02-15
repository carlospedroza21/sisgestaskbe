package com.example.sisgestaskbe.model;

import java.util.Objects;

import com.example.sisgestaskbe.enumeration.Role;

public class User {
    
    private String nombre;
    private String email;
    private Role rol;

    
    public User() {
    }
    
    public User(String nombre, String email, Role rol) {
        this.nombre = nombre;
        this.email = email;
        this.rol = rol;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setRol(Role rol) {
        this.rol = rol;
    }

    public Role getRol() {
        return rol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.nombre, this.email, this.rol);
    }

    @Override
    public String toString() {
        return "User{" +
                "nombre='" + this.nombre + '\'' +
                ", email='" + this.email + '\'' +
                ", rol='" + this.rol + '\'' +
                '}';
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.DSWeb_Practica07;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author chris
 */
@Entity
@Table(name = "usuarios")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuarios_clave_seq")
    @SequenceGenerator(name = "usuarios_clave_seq", sequenceName = "usuarios_clave_seq", 
            initialValue = 1, allocationSize = 1)
    private Long clave;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "password")
    private String password;

    public Long getClave() {
        return clave;
    }

    public User(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    
    public User(Long clave, String nombre, String password) {
        this.clave = clave;
        this.nombre = nombre;
        this.password = password;
    }

    public User() {
    }
    
    

    public void setClave(Long clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 
    
}

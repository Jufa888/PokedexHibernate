/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedexhibernate;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.*;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Jufa
 */
@Entity
@Table(name = "entrenador")

public class Entrenador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "genero")
    private String genero;
    @Column(name = "rol")
    private String rol;
    
    //Relacion N.M con Pokemon
    @ManyToMany
    @JoinTable(
            name = "pokemon_entrenador",//Tabla intermedia
            joinColumns = @JoinColumn(name = "nombreP"),
            inverseJoinColumns = @JoinColumn(name = "nombre")
    )
    private List<Pokemon> pokemones;
    

    public Entrenador() {
        
    }

    public Entrenador(String nombre, String genero, String rol) {
        this.nombre = nombre;
        this.genero = genero;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "nombre=" + nombre + ", genero=" + genero + ", rol=" + rol + '}';
    }
    
    
    
}

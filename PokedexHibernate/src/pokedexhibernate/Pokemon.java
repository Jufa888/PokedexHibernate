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
import javax.persistence.*;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Jufa
 */
@Entity
@Table(name = "pokemon")

public class Pokemon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "numeroP")
    private Integer numero;
    @Column(name = "tipo1")
    private String tipo1;
     @Column(name = "tipo2")
    private String tipo2;
      @Column(name = "descripcion")
    private String descripcion;
      
    //Relacion N.M con Entrenador
    @ManyToMany(mappedBy = "pokemones")
    private List<Entrenador> entrenadores;
    
    //Relacion N.M con Movimiento
    @ManyToMany(mappedBy = "pokemones")
    private List<Movimiento> movimientos;
    
    //Relacion N.M con Lider
    @ManyToMany(mappedBy = "pokemones")
    private List<Lider> lideres;
    
    //Relacion N.1 con Objeto
    @ManyToOne
    @JoinColumn (name = "nombreO")
    Objeto objeto;
    
    //Relacion N.1 con Generación
    @ManyToOne
    @JoinColumn (name = "numero")
    Generacion generacion;
    

    public Pokemon() {
        
    }

    public Pokemon(String nombre, Integer numero, String tipo1, String tipo2, String descripcion) {
        this.nombre = nombre;
        this.numero = numero;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", numero=" + numero + ", tipo1=" + tipo1 + ", tipo2=" + tipo2 + ", descripcion=" + descripcion + '}';
    }

    
    
    

    

}

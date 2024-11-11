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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Jufa
 */
@Entity
@Table(name = "gimnasio")

public class Gimnasio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "ciudad")
    private String ciudad;
    
    //Relacion N.1 con Generación
    @ManyToOne
    @JoinColumn (name = "numero")
    Generacion generacion;
    
    //Relacion 1.1 con Lider
    @OneToOne(mappedBy = "gimnasio")
    private Lider lider;

    public Gimnasio() {
        
    }

    public Gimnasio(String nombre, String tipo, String ciudad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Gimnasio{" + "nombre=" + nombre + ", tipo=" + tipo + ", ciudad=" + ciudad + '}';
    }

   
    
    
    
}
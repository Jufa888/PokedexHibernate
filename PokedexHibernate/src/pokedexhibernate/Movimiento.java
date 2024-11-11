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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Jufa
 */
@Entity
@Table(name = "movimiento")

public class Movimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nombreM")
    private String nombre;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "categoria")
    private String categoria;
     @Column(name = "descripcion")
    private String descripcion;
      @Column(name = "PP")
    private Integer PP;
      
    //Relacion N.M con Pokemon
    @ManyToMany
    @JoinTable(
            name = "movimiento_pokemon",//Tabla intermedia
            joinColumns = @JoinColumn(name = "nombreM"),
            inverseJoinColumns = @JoinColumn(name = "nombre")
    )
    private List<Pokemon> pokemones;
    

    public Movimiento() {
        
    }

    public Movimiento(String nombre, String tipo, String categoria, String descripcion, Integer PP) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.PP = PP;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPP() {
        return PP;
    }

    public void setPP(Integer PP) {
        this.PP = PP;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "nombre=" + nombre + ", tipo=" + tipo + ", categoria=" + categoria + ", descripcion=" + descripcion + ", PP=" + PP + '}';
    }
    
    

    

}

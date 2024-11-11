/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedexhibernate;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Jufa
 */
@Entity
@Table(name = "profesor")

public class Profesor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "inicial1")
    private String inicial1;
     @Column(name = "inicial2")
    private String inicial2;
      @Column(name = "inicial3")
    private String inicial3;
      
    //Relacion 1.1 con Generacion
    @OneToOne
    @JoinColumn (name = "numero")
    Generacion generacion;
    

    public Profesor() {
        
    }

    public Profesor(String nombre, String ciudad, String inicial1, String inicial2, String inicial3) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.inicial1 = inicial1;
        this.inicial2 = inicial2;
        this.inicial3 = inicial3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getInicial1() {
        return inicial1;
    }

    public void setInicial1(String inicial1) {
        this.inicial1 = inicial1;
    }

    public String getInicial2() {
        return inicial2;
    }

    public void setInicial2(String inicial2) {
        this.inicial2 = inicial2;
    }

    public String getInicial3() {
        return inicial3;
    }

    public void setInicial3(String inicial3) {
        this.inicial3 = inicial3;
    }

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", ciudad=" + ciudad + ", inicial1=" + inicial1 + ", inicial2=" + inicial2 + ", inicial3=" + inicial3 + '}';
    }

    
    

    

}

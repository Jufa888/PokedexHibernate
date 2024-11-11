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
@Table(name = "generacion")

public class Generacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "numero")
    private Integer numeroG;
    @Column(name = "region")
    private String region;
    @Column(name = "legendario1")
    private String legendario1;
    @Column(name = "legendario2")
    private String legendario2;
    
    //Relacion 1.N con Pokemon
    @OneToMany(mappedBy = "generacion")
    private List<Pokemon> pokemones;
    
    //Relacion 1.N con Gimnasio
    @OneToMany(mappedBy = "generacion")
    private List<Gimnasio> gimnasios;
    
    //Relacion 1.1 con Profesor
    @OneToOne(mappedBy = "generacion")
    private Profesor profesor;
    

    public Generacion() {
        
    }

    public Generacion(Integer numeroG, String region, String legendario1, String legendario2) {
        this.numeroG = numeroG;
        this.region = region;
        this.legendario1 = legendario1;
        this.legendario2 = legendario2;
    }

    public Integer getNumero() {
        return numeroG;
    }

    public void setNumero(Integer numeroG) {
        this.numeroG = numeroG;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLegendario1() {
        return legendario1;
    }

    public void setLegendario1(String legendario1) {
        this.legendario1 = legendario1;
    }

    public String getLegendario2() {
        return legendario2;
    }

    public void setLegendario2(String legendario2) {
        this.legendario2 = legendario2;
    }

    @Override
    public String toString() {
        return "Generacion{" + "numero=" + numeroG + ", region=" + region + ", legendario1=" + legendario1 + ", legendario2=" + legendario2 + '}';
    }
    
    

    
    
    
    
}

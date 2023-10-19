package com.tallerwebi.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pregunta {
	
	//ENTIDAD PREGUNTA--
	/*TIENE QUE TENER UN ID,LA PREGUNTA EN SI(DESC),
	 * LA PROV(NIVEL),FASE(NUMERO)*/
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private Integer provincia;
    private Integer  fase;
    
    

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

	public Integer getProvincia() {
		return provincia;
	}

	public void setProvincia(Integer provincia) {
		this.provincia = provincia;
	}

	public Integer getFase() {
		return fase;
	}

	public void setFase(Integer fase) {
		this.fase = fase;
	}
    
    
}

package com.tallerwebi.dominio;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Partida {

	// TIENE UN ID DE LA PARTIDA,EL USUARIO,NUMERO DEL NIVEL

	private Long id;
	private Integer nroNivelActual;
	private Integer vidas;

	// RELACION CON EL JUGADOR--USER
	@OneToOne
	private Usuario usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Integer getNroNivelActual() {
		return nroNivelActual;
	}

	public void setNroNivelActual(Integer nroNivelActual) {
		this.nroNivelActual = nroNivelActual;
	}

	public Integer getVidas() {
		return vidas;
	}

	public void aumentarVidas() {
		this.vidas = vidas++;
	}

}

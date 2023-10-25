package com.tallerwebi.dominio;

public interface RepositorioNivel {

	void guardarNivel(Nivel nivel);

	Nivel buscarNivel(Integer id);
}

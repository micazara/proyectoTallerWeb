package com.tallerwebi.dominio;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("servicioInicio")
@Transactional
public class SerivicoInicioImpl implements ServicioInicio {

	private RepositorioPregunta servicioInicio;

	@Autowired
	public SerivicoInicioImpl(RepositorioPregunta servicioNivel) {
		this.servicioInicio = servicioInicio;
	}

	@Override
	public void instanciarNiveles() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void instanciarPreguntas() {
		// TODO Auto-generated method stub
		
	}

	
}

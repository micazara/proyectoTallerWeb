package com.tallerwebi.dominio;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("servicioInicio")
@Transactional
public class ServicioInicioImpl implements ServicioInicio {

	private RepositorioNivel servicioNivel;

	@Autowired
	public ServicioInicioImpl(RepositorioNivel servicioNivel) {
		this.servicioNivel = servicioNivel;
	}

	@Override
	public void instanciarNiveles() {
		// PRIMERO CREAMOS EL NIVEL UNO
		Nivel tierraDelFuego = Nivel.Tierra_del_Fuego;
		// EMPEZAMOS A CARGARLE LA DATA
		tierraDelFuego.setId(1);
		tierraDelFuego.setNombre("Tierra del Fuego");
		// GUARDO EL NIVEL
		servicioNivel.guardarNivel(tierraDelFuego);
		// Y ASI CON TODAS
		
		Nivel santaCruz = Nivel.Santa_Cruz;
		santaCruz.setId(2);
		santaCruz.setNombre("Santa Cruz");
		servicioNivel.guardarNivel(santaCruz);
		
		Nivel chubut = Nivel.Chubut;
		chubut.setId(3);
		chubut.setNombre("Chubut");
		servicioNivel.guardarNivel(chubut);
		
		Nivel rioNegro = Nivel.Rio_Negro;
		rioNegro.setId(4);
		rioNegro.setNombre("Rio Negro");
		servicioNivel.guardarNivel(rioNegro);
		
		Nivel laPampa = Nivel.La_Pampa;
		laPampa.setId(5);
		laPampa.setNombre("La Pampa");
		servicioNivel.guardarNivel(laPampa);
		
		Nivel neuquen = Nivel.Neuquen;
		neuquen.setId(6);
		neuquen.setNombre("Neuquen");
		servicioNivel.guardarNivel(neuquen);
		
		Nivel mendoza = Nivel.Mendoza;
		mendoza.setId(7);
		mendoza.setNombre("Mendoza");
		servicioNivel.guardarNivel(rioNegro);
		
		Nivel bsas = Nivel.Buenos_Aires;
		bsas.setId(8);
		bsas.setNombre("Buenos Aires");
		servicioNivel.guardarNivel(bsas);
		
		Nivel caba = Nivel.CABA;
		caba.setId(9);
		caba.setNombre("CABA");
		servicioNivel.guardarNivel(caba);

	}

	@Override
	public void instanciarPreguntasFaseUno() {
		// TODO Auto-generated method stub

	}

	@Override
	public void instanciarPreguntasFaseDos() {
		// TODO Auto-generated method stub

	}

	@Override
	public void instanciarPreguntasFaseTres() {
		// TODO Auto-generated method stub

	}

}

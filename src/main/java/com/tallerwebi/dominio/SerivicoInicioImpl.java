package com.tallerwebi.dominio;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("servicioInicio")
@Transactional
public class SerivicoInicioImpl implements ServicioInicio {

	private RepositorioNivel servicioNivel;

	@Autowired
	public SerivicoInicioImpl(RepositorioNivel servicioNivel) {
		this.servicioNivel = servicioNivel;
	}

	@Override
	public void instanciarNiveles() {
		// PRIMERO CREAMOS EL NIVEL UNO
		Nivel tierraDelFuego = new Nivel();
		// EMPEZAMOS A CARGARLE LA DATA
		tierraDelFuego.setId(1);
		tierraDelFuego.setNombre("Tierra del Fuego");
		// GUARDO EL NIVEL
		servicioNivel.guardarNivel(tierraDelFuego);
		// Y ASI CON TODAS
		Nivel santaCruz = new Nivel();
		santaCruz.setId(2);
		santaCruz.setNombre("Santa Cruz");
		servicioNivel.guardarNivel(santaCruz);
		Nivel chubut = new Nivel();
		chubut.setId(3);
		chubut.setNombre("Chubut");
		servicioNivel.guardarNivel(chubut);
		Nivel rioNegro = new Nivel();
		rioNegro.setId(4);
		rioNegro.setNombre("Rio Negro");
		servicioNivel.guardarNivel(rioNegro);
		Nivel laPampa = new Nivel();
		laPampa.setId(5);
		laPampa.setNombre("La Pampa");
		servicioNivel.guardarNivel(laPampa);
		Nivel neuquen = new Nivel();
		neuquen.setId(6);
		neuquen.setNombre("Neuquen");
		servicioNivel.guardarNivel(neuquen);
		Nivel mendoza = new Nivel();
		mendoza.setId(7);
		mendoza.setNombre("Mendoza");
		servicioNivel.guardarNivel(rioNegro);
		Nivel bsas = new Nivel();
		bsas.setId(8);
		bsas.setNombre("Bueos Aires");
		servicioNivel.guardarNivel(bsas);
		Nivel caba = new Nivel();
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

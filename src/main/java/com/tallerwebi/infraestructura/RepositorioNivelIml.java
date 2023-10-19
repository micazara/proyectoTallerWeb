package com.tallerwebi.infraestructura;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tallerwebi.dominio.Nivel;
import com.tallerwebi.dominio.RepositorioNivel;
import com.tallerwebi.dominio.Usuario;

@Repository("repositorioNivel")
public class RepositorioNivelIml implements RepositorioNivel {

	private SessionFactory sessionFactory;

	@Autowired
	public RepositorioNivelIml(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void guardarNivel(Nivel nivel) {
		sessionFactory.getCurrentSession().save(nivel);

	}

	@Override
	public Nivel buscarNivel(Integer id) {
		return (Nivel) sessionFactory.getCurrentSession().createCriteria(Nivel.class).add(Restrictions.eq("id", id))
				.uniqueResult();
	}

}

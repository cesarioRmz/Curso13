package com.mx.CrudHibernateAutos.Dao.Imp;

import java.util.List;

import com.mx.CrudHibernateAutos.Dao.IAutos;
import com.mx.CrudHibernateAutos.Entity.Autos;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AutosImp implements IAutos{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Luffy");
	EntityManager em = emf.createEntityManager();
	@Override
	public String guardar(Autos automovil) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String editar(Autos automovil) {
		String resultEditar="0";
		if(em.find(Autos.class, automovil.getId())!=null) {
		em.getTransaction().begin();
		try {
			em.merge(automovil);
			em.getTransaction().commit();
			System.out.println("Registro actualizado correctamente");
			resultEditar = "1";
		}catch(Exception e) {
			System.out.println("Se detecto error al actualizar en: "+e.getLocalizedMessage());
			em.getTransaction().rollback();
			resultEditar = "0";
		 }
		}
		
		return resultEditar;
	}

	@Override
	public String eliminar(Autos automovil) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Autos> consultar() {
		return em.createQuery("from Autos order by id desc").getResultList();
	}

	@Override
	public Autos buscar(Autos automovil) {
		// TODO Auto-generated method stub
		return null;
	}

}

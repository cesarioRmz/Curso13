package com.mx.CrudHibernateAutos.Dao;

import java.util.List;

import com.mx.CrudHibernateAutos.Entity.Autos;

public interface IAutos {
	public String guardar(Autos automovil);
	public String editar(Autos automovil);
	public String eliminar(Autos automovil);
	public List<Autos> consultar();
	public Autos buscar(Autos automovil);
}

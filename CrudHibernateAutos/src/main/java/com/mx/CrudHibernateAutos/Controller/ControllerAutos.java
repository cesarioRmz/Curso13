package com.mx.CrudHibernateAutos.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudHibernateAutos.Dao.Imp.AutosImp;
import com.mx.CrudHibernateAutos.Entity.Autos;
import com.mx.CrudHibernateAutos.General.Response;

@RequestMapping("AutosWS")
@RestController
@CrossOrigin
public class ControllerAutos {
	AutosImp imp= null;
	Response resp = null;
	
	@GetMapping("ConsultarAutos")
	public List<Autos> consultaAuto(){
		imp = new AutosImp();
		resp = new Response();
		List<Autos> lista = imp.consultar();
		return lista;
	}
	
	@PostMapping("editar")
	public Response editar(@RequestBody Autos automovil) {
		imp = new AutosImp();
		Response res = new Response();
		
		res.setObj(automovil);
		String resultEditar = imp.editar(automovil);
		if(resultEditar.equals("1")) {
			res.setMensaje("Registro editado correctamente");
			res.setResultado(resultEditar);
		}else {
			res.setMensaje("El registro no se pudo editar exitosamente");
			res.setResultado(resultEditar);
		}
		return res;
	}
}

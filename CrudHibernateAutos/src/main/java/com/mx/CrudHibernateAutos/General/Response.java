package com.mx.CrudHibernateAutos.General;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Response {
	private String mensaje;
	private String resultado;
	Object obj;
}

package com.mx.CrudHibernateAutos.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Entity
@Table(name="AAAUTOMOVIL")
public class Autos {
	@Id
	@Column(name = "ID", columnDefinition = "NUMBER")
	private int id;
	@Column(name = "MARCA", columnDefinition = "NVARCHAR2(100)")
	private String marca;
	@Column(name = "MODELO", columnDefinition = "NVARCHAR2(100)")
	private String modelo;
	@Column(name = "TRANSMISION", columnDefinition = "NVARCHAR2(100)")
	private String transmision;
	@Column(name = "NUMPUERTAS", columnDefinition = "NUMBER")
	private int numPuertas;
	@Column(name = "COSTO", columnDefinition = "NUMBER")
	private double costo;

}

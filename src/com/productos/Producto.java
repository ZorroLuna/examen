package com.productos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long item;
 
    private String nombre;
    private int cantidad;
    private String codigo;
 
    protected Producto() {
    }
 
    protected Producto(String nombre, int cantidad, String codigo) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.codigo = codigo;
    }

	public Long getId() {
		return item;
	}

	public void setId(Long id) {
		this.item = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
 
    
 
}

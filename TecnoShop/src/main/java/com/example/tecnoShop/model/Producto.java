package com.example.tecnoShop.model;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;

//import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity //representacion de la informacion que nosotros necesitamos
@Table(name = "producto")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name="id_producto")
	private Integer id;
		
	@Column(nullable = false, name="nombre")
	private String nombre;
	
	@Column(nullable = false, name="precio")
	private Double precio;	
	
	@Column(nullable = false, name="color")
	private String color;	
	
	@Column(nullable = true, name="categoria")
	private String categoria;
	
	@Column(nullable = true, name="calificacion")
	private Float calificacion;
	
	@Column(nullable = true, name="detalles")
	private String detalles;
	
	@Column(nullable = true, name="stock")
	private Integer stock;
	
	@Column(nullable = true, name="vendidos")
	private Integer vendidos;
	
	@Column(nullable = true, name="creado")
	private LocalDateTime creado;
	
	@Column(nullable = true, name="modificado")
	private LocalDateTime modificado;
	
	
	@OneToMany(mappedBy = "producto", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Imagenes> imagenes;
	
	@OneToMany(mappedBy = "producto", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Opinion> opiniones;
	
	
	
	

	public Producto() {
		super();
		this.vendidos=0;
		this.calificacion=0f;
	}

	public LocalDateTime getCreado() {
		return creado;
	}

	public void setCreado(LocalDateTime creado) {
		this.creado = creado;
	}

	public LocalDateTime getModificado() {
		return modificado;
	}

	public void setModificado(LocalDateTime modificado) {
		this.modificado = modificado;
	}

	public Float getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Float calificacion) {
		this.calificacion = calificacion;
	}

	public Set<Opinion> getOpiniones() {
		return opiniones;
	}

	public void setOpiniones(Set<Opinion> opiniones) {
		this.opiniones = opiniones;
	}

	public Set<Imagenes> getImagenes() {
		return imagenes;
	}

	public void setImagenes(Set<Imagenes> imagenes) {
		this.imagenes = imagenes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getVendidos() {
		return vendidos;
	}

	public void setVendidos(Integer vendidos) {
		this.vendidos = vendidos;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", color=" + color + ", categoria="
				+ categoria + ", calificacion=" + calificacion + ", detalles=" + detalles + ", stock=" + stock
				+ ", vendidos=" + vendidos +"]";
	}

	

	
	
	
	

}

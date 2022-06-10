package com.example.tecnoShop.service;

import java.util.List;

import com.example.tecnoShop.model.Cliente;
import com.example.tecnoShop.model.Producto;

public interface ProductoService {
	
	// Leer
	Producto getProducto(Integer id);
	List<Producto> getProductos();
	
	
	//Guardar
	Producto saveCliente(Producto producto);
	
	
	//Borrar
	Boolean deleteProducto(Integer id);
	
	//Actualizar
	Producto updateProducto(Producto producto);

}

package com.example.tecnoShop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tecnoShop.model.Producto;
import com.example.tecnoShop.repository.ProductoRepository;

@Service
public class ProductoServiceImp implements ProductoService {
	
	ProductoRepository productoRepository;
	
	public ProductoServiceImp(@Autowired ProductoRepository productoRepository) {
		this.productoRepository=productoRepository;
	}
	

	@Override
	public Producto getProducto(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> getProductos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto saveCliente(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteProducto(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto updateProducto(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

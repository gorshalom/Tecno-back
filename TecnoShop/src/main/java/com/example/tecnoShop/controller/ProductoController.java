package com.example.tecnoShop.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.tecnoShop.model.Producto;
import com.example.tecnoShop.service.ProductoServiceImp;




@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("api/producto")
public class ProductoController {
	ProductoServiceImp productoServiceImp;
	
	public ProductoController(@Autowired ProductoServiceImp productoServiceImp) {
		this.productoServiceImp=productoServiceImp;
	}
	
	@GetMapping("all")
	public List<Producto> getProductos(){		
		return productoServiceImp.getProductos();
	}
	
	@GetMapping("{id}")
	public Producto getProducto(@RequestParam(name = "id")Integer id){
		return productoServiceImp.getProducto(id);
	}
	
	@PostMapping
	public Producto saveProducto(@RequestBody Producto producto) {
		return productoServiceImp.saveCliente(producto);
	}
	
	@DeleteMapping("{id}")
	public Boolean deleteProducto(@RequestParam(name = "id") Integer id) {
		return productoServiceImp.deleteProducto(id);
	}
	
	@PutMapping()
	public Producto updateProducto(@RequestBody Producto producto) {
		return productoServiceImp.updateProducto(producto);
	}
	

}

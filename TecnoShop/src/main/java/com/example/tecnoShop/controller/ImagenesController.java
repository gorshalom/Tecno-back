package com.example.tecnoShop.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.tecnoShop.model.Imagenes;
import com.example.tecnoShop.service.ImagenesService;
//import com.fasterxml.jackson.annotation.JsonValue;


@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("api/imagenes")

public class ImagenesController {
	
private final ImagenesService imagenesService;
	
	public ImagenesController(@Autowired ImagenesService imagenesService) {
		this.imagenesService=imagenesService;
	}
	
	@GetMapping("/{id}")
	public Imagenes getImagenes(@PathVariable Integer id) {
		return imagenesService.getImagenes(id);
	}
	
	@GetMapping("/all")
	public List<Imagenes> getImagenes(){
		return imagenesService.getImagenes();
	}
	
	// Escribir 
	@PostMapping
	public Imagenes saveImagenes(@RequestBody Imagenes imagenes) {
		System.out.println(imagenes);
		return imagenesService.saveImagenes(imagenes);
	}
	
	// Borrar
	@DeleteMapping("delete/{id}")
	public void deleteImagenes(@PathVariable Integer id) {
		imagenesService.deleteImagenes(id);
	}
	
	// Actualizar
	@PutMapping
	public Imagenes updateCliente(@RequestBody Imagenes imagenes) {
		return imagenesService.updateImagenes(imagenes);
	}

}

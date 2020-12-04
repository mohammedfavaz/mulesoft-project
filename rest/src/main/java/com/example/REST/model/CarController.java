package com.example.REST.model;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CarController{
	
	@Autowired
	private CarService service;
	
	@GetMapping("/products")
	public List<Cars> list() {
		return service.listAll();
		
		
	}
	@GetMapping("/products/{id}")
	public ResponseEntity<Cars> get(@PathVariable Integer id) {
		try {
			Cars product = service.get(id);
		return new ResponseEntity<Cars>(product, HttpStatus.OK);
		
		} catch (NoSuchElementException e) {
			
			return new ResponseEntity<Cars>(HttpStatus.NOT_FOUND);
		}
		
	
	}
	@PostMapping("/products")
	public void add(@RequestBody Cars product) {
		service.save(product);
		
	}
	@PutMapping("/products/{id}")
	public ResponseEntity<?> update(@RequestBody Cars product, @PathVariable Integer id) {
		try {
			Cars existProduct = service.get(id);
			service.save(product);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
	}
	
	
}
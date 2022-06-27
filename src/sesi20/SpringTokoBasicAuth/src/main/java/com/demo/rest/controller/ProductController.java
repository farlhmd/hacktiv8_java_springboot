package com.demo.rest.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.demo.rest.entity.Product;
import com.demo.rest.repository.ProductRepository;
import com.demo.rest.service.ProductService;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/market")
public class ProductController {

	@Autowired
	private ProductRepository produkRepository;

	@Autowired
	private ProductService produkService;

	@GetMapping("/products")
	public List<Product> findAllProducts() {
		return produkRepository.findAll();
	}

	@PostMapping("/products")
	public ResponseEntity<?> saveProducts(@RequestBody Product product) {
		//return produkService.saveProduct(product);
		produkService.saveProduct(product);
		return new ResponseEntity<>("Berhasil simpan data produk: " + product.getName(), HttpStatus.OK);
		
	}

	@GetMapping("/products/name/{name}")
	public List<Product> findAllProductsByName(@PathVariable String name) {
		return produkService.findAllProductsByName(name);
	}

	@DeleteMapping("/products/id/{id}")
	public ResponseEntity<?> deleteById(@RequestBody Product product, @PathVariable Long id) {
		// produkService.deleteProductById(id);
		
		produkService.deleteProductById(id);
		return new ResponseEntity<>("Berhasil hapus data produk",HttpStatus.OK);
	}

	@CrossOrigin
	@PutMapping("/products/id/{id}")
	public ResponseEntity<?> updateProductById(@RequestBody Product product, @PathVariable Long id) {

		try {
			Product checkProduct = produkService.findProductById(id);
			if (checkProduct.getId() != id) {
				return new ResponseEntity<>("ID Data produk tidak sesuai", HttpStatus.OK);
			}
			product.setId(id);
			produkService.saveProduct(product);

			return new ResponseEntity<>("Berhasil update data produk:" + product.getName(), HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>("Terjadi kesalahan" + e.getMessage(), HttpStatus.OK);
		}
	}

}


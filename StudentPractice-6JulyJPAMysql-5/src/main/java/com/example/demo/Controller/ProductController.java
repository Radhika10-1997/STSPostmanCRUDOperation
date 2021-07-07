package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Product;
import com.example.demo.Service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
@Autowired
private ProductService productService;
// save single product to the database
@PostMapping("/addProduct")
public Product addProduct(@RequestBody Product product) {
	return productService.saveProduct(product);
	
}

@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products){
	System.out.println("hiiiiiii");
		return productService.saveProducts(products);
}


@GetMapping("/getProducts")
public List<Product> findAll() {
 return productService.getProduct();
}

@GetMapping("/getProduct/{id}")
public Product findProductById(@PathVariable int id) {
	return productService.getProductById(id);
	
}


@GetMapping("/product/{name}")
public Product findByName(@PathVariable String name) {
	return productService.getProductByName(name);
	
}

@PutMapping("/update")
public Product  updateProductProduct(@RequestBody Product product) {
	return productService. updateProduct(product);
	
	
}
@DeleteMapping("/delete/{id}")
public String deleteById(@PathVariable int id) {
	return productService.deleteProduct( id);
	
}


}

package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Product;
import com.example.demo.Repository.ProductRepository;

@Service
public class ProductService {
@Autowired
private ProductRepository productRepository;
// post save single product
public  Product saveProduct(Product product)
{
	return productRepository.save(product);
	
}
// post save list of product
public  List<Product> saveProducts(List<Product> products)
{
	return productRepository.saveAll(products);
	
}
// get to fetch List of  products

public List<Product> getProduct()

{
	return productRepository.findAll();
	
}
//// get to fetch single one  product
public  Product getProductById(int id)
{
	return productRepository.findById(id).orElse(null);
	
}
//by name return product farom database
public  Product getProductByName(String name)
{
	return productRepository.findByName(name);
	
}

// delete product

public String deleteProduct(int id) {
	productRepository.deleteById(id);
	return "product removed"+id;
	
}

// update
public Product updateProduct(Product product)
{
	Product existingOProduct=productRepository.findById(product.getId()).orElse(null);
	existingOProduct.setName(product.getName());
	existingOProduct.setQuantity(product.getQuantity());
	existingOProduct.setPrice(product.getPrice());

	return productRepository.save(existingOProduct);
	
}






}

package com.klu.productapplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	
	@Autowired
	ProductRepository pr;
	public void insertproduct(product p) {
		pr.save(p);
	}
	
public List<product> retrieveproduct()
{
		return pr.findAll();
	}
	
}

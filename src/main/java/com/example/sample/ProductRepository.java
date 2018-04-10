package com.example.sample;


import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository extends AbstractRepository<Integer, Product> {

	
	public Product findById(int id)
	{
		return getByKey(id);
		
	}
	
	public void saveProduct(Product product)
	{
		persist(product);
	}
	@SuppressWarnings("unchecked")
	public List<Product> findAll() {
		Criteria criteria = createEntityCriteria();
		return (List<Product>) criteria.list();
	}
}

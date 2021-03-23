package com.mpicosque.dsclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpicosque.dsclient.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
package com.bookworm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookworm.entities.Product;
import com.bookworm.entities.ProductBenMaster;

@Repository
public interface ProductBenRepository extends JpaRepository<ProductBenMaster, Long>  
{
	

}

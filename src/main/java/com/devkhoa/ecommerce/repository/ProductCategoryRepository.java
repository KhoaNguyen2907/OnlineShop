package com.devkhoa.ecommerce.repository;

import com.devkhoa.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path = "product-category", collectionResourceRel = "productCategory")
@CrossOrigin
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}

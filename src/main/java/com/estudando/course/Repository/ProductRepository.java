package com.estudando.course.Repository;

import com.estudando.course.Entities.Category;
import com.estudando.course.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

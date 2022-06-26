package src.sesi17.assignment3.SpringTokoApaAja.src.main.java.com.demo.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.rest.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product> findAllByName(String name);

	Product findProductsById(Long id);

}

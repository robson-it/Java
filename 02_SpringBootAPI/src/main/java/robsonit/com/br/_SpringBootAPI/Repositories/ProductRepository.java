package robsonit.com.br._SpringBootAPI.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import robsonit.com.br._SpringBootAPI.Models.ProductModel;

import java.util.UUID;


@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {



}

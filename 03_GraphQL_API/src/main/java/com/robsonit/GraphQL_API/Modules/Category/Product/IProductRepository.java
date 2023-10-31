package com.robsonit.GraphQL_API.Modules.Category.Product;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface IProductRepository extends CrudRepository<ProductEntity, UUID> {
}

package com.robsonit.GraphQL_API.Modules.Category;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ICategoryRepository extends CrudRepository<CategoryEntity, UUID> {
}

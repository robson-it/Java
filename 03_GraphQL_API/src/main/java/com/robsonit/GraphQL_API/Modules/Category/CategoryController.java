package com.robsonit.GraphQL_API.Modules.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Optional;
import java.util.UUID;

@Controller
public class CategoryController {

    @Autowired
    private ICategoryRepository iCategoryRepository;

    @MutationMapping()
    CategoryEntity addCategory(@Argument CategoryInput category) {
        var categoryCreated = this.iCategoryRepository.save(new CategoryEntity(category.name));
        return categoryCreated;
    }

    @QueryMapping()
    Optional<CategoryEntity> categoryById(@Argument UUID id){
        var categoryBusca = this.iCategoryRepository.findById(id);
        return categoryBusca;
    }
    record CategoryInput(String name) {
    }
}

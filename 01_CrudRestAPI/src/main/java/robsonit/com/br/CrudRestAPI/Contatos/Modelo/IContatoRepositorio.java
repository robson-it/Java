package robsonit.com.br.CrudRestAPI.Contatos.Modelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "contatos", path = "contatos")
public interface IContatoRepositorio extends JpaRepository<Contato, Long>{
    
}

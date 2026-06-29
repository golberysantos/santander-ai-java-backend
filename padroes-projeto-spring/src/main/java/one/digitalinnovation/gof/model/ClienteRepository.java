package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.padroes.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
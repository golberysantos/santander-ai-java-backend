package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.padroes.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
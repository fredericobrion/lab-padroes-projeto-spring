package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
// Não tem nd pq o CrudRepository já tem tudo
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
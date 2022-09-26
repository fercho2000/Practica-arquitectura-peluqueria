package poli.peluqueria.repositorio.crudrepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import poli.peluqueria.repositorio.entidades.EntidadAgenda;

@Repository
public interface CrudAgendaRepository extends CrudRepository<EntidadAgenda, Integer> {

    EntidadAgenda findByCedulaCliente(String cedulaCliente);

    Iterable<EntidadAgenda> findAll();

    void deleteById(Long id);

}

package poli.peluqueria.repositorio.adapatadores;

import org.springframework.stereotype.Repository;
import poli.peluqueria.modelo.Agenda;
import poli.peluqueria.puerto.repositorio.RepositorioAgenda;
import poli.peluqueria.repositorio.builder.MaperAgenda;
import poli.peluqueria.repositorio.crudrepository.CrudAgendaRepository;
import poli.peluqueria.repositorio.entidades.EntidadAgenda;

@Repository
public class RepositorioAgendaData implements RepositorioAgenda {

    CrudAgendaRepository crudAgendaRepository;

    public RepositorioAgendaData(CrudAgendaRepository crudAgendaRepository) {
        this.crudAgendaRepository = crudAgendaRepository;
    }

    @Override
    public void crear(Agenda agenda) {

        EntidadAgenda entidadAgenda = this.crudAgendaRepository
                .findByCedulaCliente(agenda.getCedulaCliente());
        if (entidadAgenda == null) {
            this.crudAgendaRepository.save(MaperAgenda.convertirAEntidad(agenda));
        }
    }

}

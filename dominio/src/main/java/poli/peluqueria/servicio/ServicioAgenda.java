package poli.peluqueria.servicio;

import poli.peluqueria.modelo.Agenda;
import poli.peluqueria.puerto.repositorio.RepositorioAgenda;


public class ServicioAgenda {

    private RepositorioAgenda repositorioAgenda;

    public ServicioAgenda(RepositorioAgenda repositorioAgenda) {

        this.repositorioAgenda = repositorioAgenda;
    }

    public void eliminar(String cedulaCliente) {
        this.repositorioAgenda.delete(cedulaCliente);
    }

    public void ejecutar(Agenda agenda) {
        this.repositorioAgenda.crear(agenda);
    }

    public Agenda actualizar(String cedulaCliente, Agenda agenda) {
       return this.repositorioAgenda.actualizar(cedulaCliente, agenda);
    }
    public Agenda obtener(String cedulaCliente){
        return this.repositorioAgenda.obtener(cedulaCliente);
    }
}

package poli.peluqueria.puerto.repositorio;


import poli.peluqueria.modelo.Agenda;

public interface RepositorioAgenda {

    void crear(Agenda agenda);

    Agenda obtener(String cedulaCliente);

    void delete(int id);
}

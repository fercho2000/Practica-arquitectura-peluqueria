package poli.peluqueria.comando.manejador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import poli.peluqueria.modelo.Agenda;
import poli.peluqueria.servicio.ServicioAgenda;

import java.time.LocalDateTime;

@Component
public class ManejadorAgenda {
    private final ServicioAgenda servicioAgenda;

    @Autowired
    public ManejadorAgenda(ServicioAgenda servicioAgenda) {
        this.servicioAgenda = servicioAgenda;
    }

    private String cedulaCliente;
    private String nombreCompletoCliente;
    private String fecha;
    private String descripcionServicio;
    private String nombreEncargadoServicio;

    public void ejecutar(ComandoAgenda comandoAgenda) {

        this.servicioAgenda.ejecutar(
                new Agenda(comandoAgenda.getCedulaCliente(),
                        comandoAgenda.getNombreCompletoCliente(),
                        LocalDateTime.parse(comandoAgenda.getFecha()),
                        comandoAgenda.getDescripcionServicio(),
                        comandoAgenda.getNombreEncargadoServicio())
        );
    }

    public Agenda obtener(String cedulaCliente){
        return this.servicioAgenda.obtener(cedulaCliente);
    }
}

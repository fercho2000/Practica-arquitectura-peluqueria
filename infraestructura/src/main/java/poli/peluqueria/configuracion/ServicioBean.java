package poli.peluqueria.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import poli.peluqueria.puerto.repositorio.RepositorioAgenda;
import poli.peluqueria.servicio.ServicioAgenda;

@Configuration
public class ServicioBean {

    RepositorioAgenda repositorioAgenda;
    public ServicioBean() {
    }

    @Bean
    public ServicioAgenda crearServicio(RepositorioAgenda repositorioAgenda) {
        return new ServicioAgenda(repositorioAgenda);
    }


}

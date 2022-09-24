package poli.peluqueria.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import poli.peluqueria.comando.manejador.ManejadorAgenda;

@RestController
@CrossOrigin(origins = "*")
public class ControladorAgenda {

    private final ManejadorAgenda manejadorAgenda;

    @Autowired
    public ControladorAgenda(ManejadorAgenda manejadorAgenda) {
        this.manejadorAgenda = manejadorAgenda;
    }

}

package poli.peluqueria.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import poli.peluqueria.comando.manejador.ComandoAgenda;
import poli.peluqueria.comando.manejador.ManejadorAgenda;

@RestController
@CrossOrigin(origins = "*")
public class ControladorAgenda {

    private final ManejadorAgenda manejadorAgenda;

    @Autowired
    public ControladorAgenda(ManejadorAgenda manejadorAgenda) {
        this.manejadorAgenda = manejadorAgenda;
    }
    @PostMapping("/registrarAgenda")
    public void crearHistorialParqueadero(@RequestBody ComandoAgenda comandoAgenda) {
        this.manejadorAgenda.ejecutar(comandoAgenda);
    }
}

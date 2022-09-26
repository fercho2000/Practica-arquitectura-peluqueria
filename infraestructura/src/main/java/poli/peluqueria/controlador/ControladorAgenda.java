package poli.peluqueria.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import poli.peluqueria.comando.manejador.ComandoAgenda;
import poli.peluqueria.comando.manejador.ManejadorAgenda;
import poli.peluqueria.modelo.Agenda;

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

    @GetMapping("/obtenerAgenda/{cedulaCliente}")
    public Agenda obtenerAgenda(@PathVariable String cedulaCliente) {
        return this.manejadorAgenda.obtener(cedulaCliente);
    }
}

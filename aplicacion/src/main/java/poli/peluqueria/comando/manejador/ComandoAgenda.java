package poli.peluqueria.comando.manejador;


public class ComandoAgenda {

    private String cedulaCliente;
    private String nombreCompletoCliente;
    private String fecha;
    private String descripcionServicio;
    private String nombreEncargadoServicio;

    public ComandoAgenda() {
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public String getNombreCompletoCliente() {
        return nombreCompletoCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    public String getNombreEncargadoServicio() {
        return nombreEncargadoServicio;
    }
}

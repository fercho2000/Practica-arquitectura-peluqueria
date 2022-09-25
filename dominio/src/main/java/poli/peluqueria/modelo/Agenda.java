package poli.peluqueria.modelo;

import java.time.LocalDateTime;

public class Agenda {

    private String cedulaCliente;
    private String nombreCompletoCliente;
    private LocalDateTime fecha;
    private String descripcionServicio;
    private String nombreEncargadoServicio;

    public Agenda(String cedulaCliente, String nombreCompletoCliente, LocalDateTime fecha, String descripcionServicio, String nombreEncargadoServicio) {
        this.cedulaCliente = cedulaCliente;
        this.nombreCompletoCliente = nombreCompletoCliente;
        this.fecha = fecha;
        this.descripcionServicio = descripcionServicio;
        this.nombreEncargadoServicio = nombreEncargadoServicio;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getNombreCompletoCliente() {
        return nombreCompletoCliente;
    }

    public void setNombreCompletoCliente(String nombreCompletoCliente) {
        this.nombreCompletoCliente = nombreCompletoCliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    public void setDescripcionServicio(String descripcionServicio) {
        this.descripcionServicio = descripcionServicio;
    }

    public String getNombreEncargadoServicio() {
        return nombreEncargadoServicio;
    }

    public void setNombreEncargadoServicio(String nombreEncargadoServicio) {
        this.nombreEncargadoServicio = nombreEncargadoServicio;
    }
}

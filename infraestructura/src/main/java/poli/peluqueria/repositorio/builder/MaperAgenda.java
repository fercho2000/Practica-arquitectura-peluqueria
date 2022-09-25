
package poli.peluqueria.repositorio.builder;

import poli.peluqueria.modelo.Agenda;
import poli.peluqueria.repositorio.entidades.EntidadAgenda;

public final class MaperAgenda {

    private MaperAgenda() {

    }

    public static Agenda convertirAModelo(EntidadAgenda entidadAgenda) {

        Agenda agenda = null;

        if (entidadAgenda != null) {
            agenda = new Agenda(entidadAgenda.getCedulaCliente(),
                    entidadAgenda.getNombreCompletoCliente(),
                    entidadAgenda.getFecha(), entidadAgenda.getDescripcionServicio(),
                    entidadAgenda.getNombreEncargadoServicio());

        }
        return agenda;

    }

    public static EntidadAgenda convertirAEntidad(Agenda agenda) {
        EntidadAgenda entidadAgenda = null;
        if (agenda != null) {
            entidadAgenda = new EntidadAgenda(
                    agenda.getCedulaCliente(),
                    agenda.getNombreCompletoCliente(),
                    agenda.getFecha(),
                    agenda.getDescripcionServicio(),
                    agenda.getNombreEncargadoServicio()
            );

        }
        return entidadAgenda;
    }
//
//	public static List<HistorialParqueo> convertirAModelo(Iterable<EntityHistorialParqueo> listaParqueosEntities) {
//		List<HistorialParqueo> listaParqueo = new ArrayList<>();
//		for (EntityHistorialParqueo parqueoEntity : listaParqueosEntities) {
//			listaParqueo.add(convertirAModelo(parqueoEntity));
//		}
//		return listaParqueo;
//	}
//
//	public static EntityHistorialParqueo convertirAEntidad(HistorialParqueo parqueo) {
//		EntityHistorialParqueo parqueoEntity = null;
//
//		if (parqueo != null) {
//			parqueoEntity = new EntityHistorialParqueo();
//			parqueoEntity.setVehiculo(MaperVehiculo.convertirAEntidad(parqueo.getVehiculo()));
//			parqueoEntity.setFechaIngreso(parqueo.getFechaIngreso());
//			parqueoEntity.setFechaSalida(parqueo.getFechaSalida());
//			parqueoEntity.setPago(parqueo.getPago());
//		}
//
//		return parqueoEntity;
//	}


}

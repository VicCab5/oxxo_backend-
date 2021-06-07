package mx.edu.itlapiedad.services;


import java.util.List;

import mx.edu.itlapiedad.models.Ticket_renglones_importe;
import mx.edu.itlapiedad.models.Tickets_renglones;

public interface Tickets_renglonesService {
	List<Tickets_renglones> consultarTickets_renglones(); 
	Tickets_renglones buscar(int id);
	Tickets_renglones insertar(Tickets_renglones Tickets_renglones);
	void actualizar(Tickets_renglones Tickets_renglones);
	void eliminar(int id);
	List<Ticket_renglones_importe> buscar_importe_cajero(int id);

	


}

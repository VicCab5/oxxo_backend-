package mx.edu.itlapiedad.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import mx.edu.itlapiedad.DAO.Tickets_renglonesDAO;
import mx.edu.itlapiedad.models.Tickets_renglones;

@Service
public class Tickets_renglonesLogic implements Tickets_renglonesService {
	
    @Autowired
    Tickets_renglonesDAO repositorio;
	

	@Override
	public List<Tickets_renglones> consultarTickets_renglones() {

		return repositorio.consultarTickets_renglones();
	}

	@Override
	public Tickets_renglones buscarTickets_renglones(int id) {
		
		return repositorio.buscarTickets_renglones(id);
	}
	
	
	
	@Override
	public Tickets_renglones insertar(Tickets_renglones TR) {
		
		return repositorio.insertarTickets_renglones(TR);
	}
	
	@Override
	public void actualizarTickets_renglones(Tickets_renglones  TR) {
		
		repositorio.actualizarTickets_renglones(TR);
	}

	@Override
	public Tickets_renglones insertarTickets_renglones(Tickets_renglones TR) {
		
		return null;
	}
	

}

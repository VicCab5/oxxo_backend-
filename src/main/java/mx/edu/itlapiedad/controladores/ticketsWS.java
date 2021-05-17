package mx.edu.itlapiedad.controladores;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;//import org.springframework.web.bind.annotation.PostMapping;
import mx.edu.itlapiedad.models.tickets;
import mx.edu.itlapiedad.services.ticketsService;
import org.springframework.web.bind.annotation.*;

	@RestController
	@RequestMapping("/devops/tickets")
	
public class ticketsWS {
		
		@Autowired
		ticketsService servicio;

		@GetMapping()
		public ResponseEntity<?> consultarTickets(){
			List<tickets> resultado;
			try {
				resultado = servicio.consultarTickets();
			}catch (DataAccessException e) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<List<tickets>>(resultado,HttpStatus.OK);
		}
		@GetMapping("/{id}")
		public ResponseEntity<?> buscar(@PathVariable int id){
			tickets resultado;
			try {
				resultado=servicio.buscar(id);
			} catch (DataAccessException e) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<tickets>(resultado,HttpStatus.OK);
		}
		
		@PostMapping("")
		public ResponseEntity<?>insertar(@RequestBody tickets tickets){
			tickets resultado;
		try {
			resultado=servicio.insertar(tickets);
			
		} catch (DataAccessException e) {
		return new ResponseEntity<>(HttpStatus.CONFLICT);
		}	
			return new ResponseEntity<tickets>(resultado,HttpStatus.CREATED);
		
		}
}

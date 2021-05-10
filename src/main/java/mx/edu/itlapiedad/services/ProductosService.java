package mx.edu.itlapiedad.services;

import java.util.List;

import mx.edu.itlapiedad.models.Productos;

public interface ProductosService {
	List<Productos> consultarProductos(); 
	Productos buscar(int id);
	
}

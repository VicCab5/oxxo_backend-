package mx.edu.itlapiedad.DAO;

import java.util.List;

import mx.edu.itlapiedad.models.Productos;

public interface ProductosDAO {

	List<Productos> consultarProductos();
	Productos buscar(int id);
}

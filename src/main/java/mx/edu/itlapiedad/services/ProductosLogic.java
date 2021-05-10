package mx.edu.itlapiedad.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.itlapiedad.DAO.*;
import mx.edu.itlapiedad.models.Productos;

@Service

public class ProductosLogic implements ProductosService {
	
    @Autowired
    ProductosDAO repositorio;
	
	@Override
	public List<Productos> consultarProductos() {

		return repositorio.consultarProductos();
	}
}

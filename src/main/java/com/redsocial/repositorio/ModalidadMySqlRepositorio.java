package com.redsocial.repositorio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.redsocial.entidad.Modalidad;

@Repository
public class ModalidadMySqlRepositorio implements ModalidadRepositorio{

	@Autowired
    private JdbcTemplate jdbcTemplate ;
	
	@Override
	public Modalidad insertaActualizaModalidad(Modalidad obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminaModalidad(int idModalidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Modalidad> listaModalidad() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Modalidad> listaModalidadPorNombre(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Modalidad> listaMoldalidad(int idDeporte, String nombre, int edad) {
		// TODO Auto-generated method stub
		return null;
	}

}

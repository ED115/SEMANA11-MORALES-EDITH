package com.redsocial.repositorio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.redsocial.entidad.Deporte;

@Repository
public class DeporteMySqlRepositorio implements DeporteRepositorio{

	@Autowired
    private JdbcTemplate jdbcTemplate ;
	
	@Override
	public List<Deporte> listaDeporte() {
		// TODO Auto-generated method stub
		return null;
	}

}
